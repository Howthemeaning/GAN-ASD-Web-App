package imu.hzm.ganasd.dao;

import imu.hzm.ganasd.model.Phone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneDao {

    public int updateUserPhoneId(@Param("userId") Long userId, @Param("phoneId") Long phoneId);

    public Long findPhoneIdByName(@Param("phoneName") String phoneName);

    public List<String> findAllPhone(@Param("brandId") Long brandId);

    public Phone findUserPhone(@Param("phoneId") Long phoneId);
}
