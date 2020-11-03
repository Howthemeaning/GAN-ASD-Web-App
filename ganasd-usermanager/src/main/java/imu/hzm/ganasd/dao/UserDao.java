package imu.hzm.ganasd.dao;

import imu.hzm.ganasd.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    public User userLogin(@Param("email") String email, @Param("password") String password);

    public User userFindByEmail(String email);

    public Long userRegister(User user);
}
