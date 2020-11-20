package imu.hzm.ganasd.dao;

import imu.hzm.ganasd.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    User userLogin(@Param("email") String email, @Param("password") String password);

    User userFindByEmail(String email);

    Long userRegister(User user);
}
