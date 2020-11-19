package imu.hzm.ganasd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusData implements Serializable {
    private Long statusId;
    private Long userId;
    private Long phoneId;
    private String dataFile;
    private String statusData;
    private Date startTime;
    private Date endTime;
    private String applist;
}
