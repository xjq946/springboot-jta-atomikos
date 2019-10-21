package com.example.springbootjtaatomikos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiejiqing
 * @description
 * @create 2019/10/19 18:06
 */
@Data
@ConfigurationProperties(prefix = "mysql.datasource.test1")
public class DBConfig1 {

    private String url;
    private String username;
    private String password;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
}

