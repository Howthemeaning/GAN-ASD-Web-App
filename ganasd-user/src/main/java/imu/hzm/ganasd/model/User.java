package imu.hzm.ganasd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class User {
    private Long userId;

    @NotNull
    @Size(max = 30, min = 6, message = "长度必须大于等于6，小于等于30")
    private String username;

    @NotNull
    @Size(max = 30, min = 6, message = "长度必须大于等于6，小于等于30")
    private String password;

    @NotNull
    @Email(message = "必须是邮箱格式")
    private String email;
    private Long phoneId;
}
