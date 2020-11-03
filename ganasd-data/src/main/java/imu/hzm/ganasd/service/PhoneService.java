package imu.hzm.ganasd.service;

import imu.hzm.ganasd.model.Brand;
import imu.hzm.ganasd.model.Phone;
import imu.hzm.ganasd.model.User;

import java.util.List;
import java.util.Map;

public interface PhoneService {

    public int updateUserPhoneId(Long userId, Long phoneId);

    public Long findPhoneIdByName(String phoneName);

    public List<String> findAllPhone(Long brand);

    public Phone findUserPhone(Long phoneId);
}
