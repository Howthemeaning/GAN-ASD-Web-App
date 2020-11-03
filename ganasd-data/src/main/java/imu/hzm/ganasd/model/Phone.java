package imu.hzm.ganasd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable {
    private Long phoneId;
    private Long brandId;
    private String phoneName;
}
