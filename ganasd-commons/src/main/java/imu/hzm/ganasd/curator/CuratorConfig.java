package imu.hzm.ganasd.curator;

import lombok.Data;

@Data
public class CuratorConfig {
    private String  namespace           = "ganasd";
    private String  connectString       = "127.0.0.1:2181";
    private int     sessionTimeoutMs    = 12000;
    private int     connectionTimeoutMs = 3000;
    private String  retryType           = RetryTypeEnum.RETRY_FOREVER.getValue();
    private boolean enableListener      = false;

    private ExponentialBackoffRetryConfig        exponentialBackoffRetry;
    private BoundedExponentialBackoffRetryConfig boundedExponentialBackoffRetry;
    private RetryNTimesConfig                    retryNTimes;
    private RetryForeverConfig                   retryForever = new RetryForeverConfig();
    private RetryUntilElapsedConfig              retryUntilElapsed;

    @Data
    public static class ExponentialBackoffRetryConfig {
        private int baseSleepTimeMs = 2000;
        private int maxRetries      = 10;
    }

    @Data
    public static class BoundedExponentialBackoffRetryConfig {
        private int baseSleepTimeMs = 2000;
        private int maxSleepTimeMs  = 60000;
        private int maxRetries      = 10;
    }

    @Data
    public static class RetryNTimesConfig {
        private int count                 = 10;
        private int sleepMsBetweenRetries = 2000;
    }

    @Data
    public static class RetryForeverConfig {
        private int retryIntervalMs = 1000;
    }

    @Data
    public static class RetryUntilElapsedConfig {
        private int maxElapsedTimeMs      = 6000;
        private int sleepMsBetweenRetries = 2000;
    }
}
