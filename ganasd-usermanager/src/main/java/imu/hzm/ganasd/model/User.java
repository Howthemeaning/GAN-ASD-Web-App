package imu.hzm.ganasd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String username;
    private String password;
    private String email;
    private Long authorityId;
    private Long phoneId;

}
