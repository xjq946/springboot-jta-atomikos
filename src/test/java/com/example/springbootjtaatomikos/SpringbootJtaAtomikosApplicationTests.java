package com.example.springbootjtaatomikos;

import com.example.springbootjtaatomikos.config.DBConfig1;
import com.example.springbootjtaatomikos.config.DBConfig2;
import com.example.springbootjtaatomikos.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootJtaAtomikosApplication.class)
class SpringbootJtaAtomikosApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        int result = userService.insertDB1(1, "zhangSan");
        System.out.println(result);
    }

}
