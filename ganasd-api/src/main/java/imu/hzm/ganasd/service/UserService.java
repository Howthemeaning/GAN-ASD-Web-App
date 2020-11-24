package imu.hzm.ganasd.service;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.model.User;

public interface UserService {
    CommonResult userLogin(String email, String password);
    CommonResult userRegister(User user);
    CommonResult userModUsername(User user);
}
