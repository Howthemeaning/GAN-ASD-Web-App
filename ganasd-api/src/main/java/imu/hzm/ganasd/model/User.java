package imu.hzm.ganasd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class User implements Serializable {
    private static final long serialVersionUID = -859149312897255212L;
    private Long userId;

    @Size(max = 30, min = 6, message = "长度必须大于等于6，小于等于30")
    private String username;

    @Size(max = 30, min = 6, message = "长度必须大于等于6，小于等于30")
    private String password;

    @Email(message = "必须是邮箱格式")
    private String email;
    private Long phoneId;
}
