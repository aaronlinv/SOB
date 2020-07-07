package com.al.blog.services.impl;

import com.al.blog.dao.SettingsDao;
import com.al.blog.dao.UserDao;
import com.al.blog.pojo.Setting;
import com.al.blog.pojo.SobUser;
import com.al.blog.response.ResponseResult;
import com.al.blog.services.IUserService;
import com.al.blog.utils.Constant;
import com.al.blog.utils.SnowflakeIdWorker;
import com.al.blog.utils.TextUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Date;

@Slf4j
@Service
// 操作数据库，事务管理起来 
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private SnowflakeIdWorker idWorker;

    @Autowired
    private UserDao userDao;
    @Autowired
    private SettingsDao settingsDao;

    @Override
    public ResponseResult initManagerAccount(SobUser sobUser, HttpServletRequest request) {
        // 检查是否有初始化
        Setting managerAccountState = settingsDao.findOneByKey(Constant.Settings.MANAGER_ACCOUNT_INIT_STATE);
        if (managerAccountState != null) {
            return ResponseResult.FAILED("管理员账号已经初始化了");
        }
        
        // 检查数据
        if (TextUtils.isEmpty(sobUser.getUserName())) {
            return ResponseResult.FAILED("用户名不能为空");
        }
        if (TextUtils.isEmpty(sobUser.getPassword())) {
            return ResponseResult.FAILED("密码不能为空");
        }
        if (TextUtils.isEmpty(sobUser.getEmail())) {
            return ResponseResult.FAILED("邮箱不能为空");
        }

        sobUser.setId(String.valueOf(idWorker.nextId()));
        sobUser.setRoles(Constant.User.ROLE_ADMIN);
        sobUser.setAvatar(Constant.User.DEFAULT_AVATAR);
        sobUser.setState(Constant.User.DEFAULT_STATE);
        String remoteAddr = request.getRemoteAddr();
        String localAddr = request.getLocalAddr();
        log.info("remoteAddr == >" + remoteAddr);
        log.info("localAddr == >" + localAddr);
        sobUser.setLogin_ip(remoteAddr);
        sobUser.setReg_ip(remoteAddr);
        sobUser.setCreateTime(new Date());
        sobUser.setUpdateTime(new Date());
        // 保存数据库
        userDao.save(sobUser);
        // 更新标记
        Setting setting = new Setting();
        setting.setId(String.valueOf(idWorker.nextId()));
        setting.setCreateTime(new Date());
        setting.setUpdateTime(new Date());
        setting.setKey(Constant.Settings.MANAGER_ACCOUNT_INIT_STATE);
        setting.setValue("1");
        
        settingsDao.save(setting);
        
        return ResponseResult.SUCCESS("初始化成功");
    }
}
