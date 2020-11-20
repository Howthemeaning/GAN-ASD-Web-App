package imu.hzm.ganasd.service;

import imu.hzm.ganasd.model.User;

public interface UserService {
    User userLogin(String email, String password);
    boolean userIsExist(String email);
    Long userRegister(User user);
}
