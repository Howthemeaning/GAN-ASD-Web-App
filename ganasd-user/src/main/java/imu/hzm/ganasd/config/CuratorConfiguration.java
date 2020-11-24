package imu.hzm.ganasd.config;

import imu.hzm.ganasd.curator.CuratorConfig;
import imu.hzm.ganasd.curator.service.CuratorInstance;
import imu.hzm.ganasd.curator.CuratorInstanceImpl;
import org.apache.curator.framework.CuratorFramework;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CuratorConfiguration {
//    @Bean
//    @ConfigurationProperties(prefix = "curator")
//    public CuratorConfig curatorConfig() {
//        return new CuratorConfig();
//    }
//
//    @Bean
//    @ConditionalOnBean(name = "curatorConfig")
//    public CuratorInstance curatorInstance(CuratorConfig curatorConfig) throws Exception {
//        return new CuratorInstanceImpl(curatorConfig);
//    }
//
//    @Bean
//    @ConditionalOnBean(name = "curatorInstance")
//    public CuratorFramework curatorFramework(CuratorInstance curatorInstance) {
//        return curatorInstance.getCurator();
//    }
}
