package com.webank.cmdb.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableCaching
@ComponentScan({ "com.webank.cmdb.service", "com.webank.cmdb.mvc", "com.webank.cmdb.util" })
@Import({ DatabaseConfig.class })
@EnableConfigurationProperties({ AppProperties.class })
public class SpringAppConfig {
}