package com.example.springbootjtaatomikos;

import com.example.springbootjtaatomikos.config.DBConfig1;
import com.example.springbootjtaatomikos.config.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@SpringBootApplication
//加载两个配置类
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class SpringbootJtaAtomikosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJtaAtomikosApplication.class, args);
    }
}
