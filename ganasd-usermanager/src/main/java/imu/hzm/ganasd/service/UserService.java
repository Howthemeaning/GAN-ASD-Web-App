package imu.hzm.ganasd.service;

import imu.hzm.ganasd.model.User;

public interface UserService {
    public User userLogin(String email, String password);
    public boolean userIsExist(String email);
    public Long userRegister(User user);
}
