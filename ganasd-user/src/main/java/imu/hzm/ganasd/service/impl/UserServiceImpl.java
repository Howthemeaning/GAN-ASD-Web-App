package imu.hzm.ganasd.service.impl;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.dao.UserDao;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public CommonResult userLogin(String email, String password) {
        if(userDao.userLogin(email, password) != null)
            return new CommonResult(200, "登陆成功", email);
        else
            return new CommonResult(401, "用户名或密码错误", null);
    }

    @Override
    public CommonResult userRegister(User user) {
        if(userDao.userFindByEmail(user.getEmail()) != null){
            userDao.userRegister(user);
            return new CommonResult(200, "注册成功", user.getEmail());
        }else {
            return new CommonResult(400, "当前用户已存在", null);
        }
    }

    @Override
    public CommonResult userModUsername(User user) {
        if (userDao.userFindByUserId(user.getUserId()) != null){
            userDao.userModUsername(user);
            return new CommonResult(200, "修改成功", user.getUserId());
        } else {
            return new CommonResult(422, "该用户不存在", null);
        }
    }
}
