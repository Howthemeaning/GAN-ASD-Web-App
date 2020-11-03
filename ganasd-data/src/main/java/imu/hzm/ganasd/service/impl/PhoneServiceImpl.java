package imu.hzm.ganasd.service.impl;

import imu.hzm.ganasd.dao.PhoneDao;
import imu.hzm.ganasd.model.Phone;
import imu.hzm.ganasd.service.PhoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Resource
    PhoneDao phoneDao;

    @Override
    public int updateUserPhoneId(Long userId, Long phoneId) {
        return phoneDao.updateUserPhoneId(userId, phoneId);
    }

    @Override
    public Long findPhoneIdByName(String phoneName) {
        return phoneDao.findPhoneIdByName(phoneName);
    }

    @Override
    public List<String> findAllPhone(Long brandId) {
        return phoneDao.findAllPhone(brandId);
    }

    @Override
    public Phone findUserPhone(Long phoneId) {
        return phoneDao.findUserPhone(phoneId);
    }
}
