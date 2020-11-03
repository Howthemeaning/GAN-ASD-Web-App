package imu.hzm.ganasd.service.impl;

import imu.hzm.ganasd.dao.UserDao;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User userLogin(String email, String password) {
        return userDao.userLogin(email, password);
    }

    @Override
    public boolean userIsExist(String email) {
        if (userDao.userFindByEmail(email) == null)
            return false;
        else
            return true;
    }

    @Override
    public Long userRegister(User user) {
        return userDao.userRegister(user);
    }
}
