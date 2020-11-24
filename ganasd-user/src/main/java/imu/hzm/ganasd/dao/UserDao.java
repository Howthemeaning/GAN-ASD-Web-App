package imu.hzm.ganasd.dao;

import imu.hzm.ganasd.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User userLogin(@Param("email") String email, @Param("password") String password);

    User userFindByEmail(String email);

    Long userRegister(User user);

    User userFindByUserId(Long userId);

    int userModUsername(User user);
}
