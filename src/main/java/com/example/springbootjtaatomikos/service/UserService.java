package com.example.springbootjtaatomikos.service;

import com.example.springbootjtaatomikos.mapper1.UserMapper1;
import com.example.springbootjtaatomikos.mapper2.UserMapper2;
import com.example.springbootjtaatomikos.pojo.User1;
import com.example.springbootjtaatomikos.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiejiqing
 * @description
 * @create 2019/10/19 18:35
 */
@Service
public class UserService {

    @Autowired
    private UserMapper1 userMapper1;

    @Autowired
    private UserMapper2 userMapper2;

    // 开启事务
    @Transactional
    public int insertDB1(Integer id,String username) {
        User1 user1 = User1.builder().id(id).username(username).build();
        int result = userMapper1.insert(user1);
        result += insertDB2(id,username);
        return result;
    }

    // 开启事务
    @Transactional
    public int insertDB2(Integer id,String username) {
        User2 user2 = User2.builder().id(id).username(username).build();
        int result = userMapper2.insert(user2);
        //故意抛出异常
        int i = 1 / 0;
        return result;
    }
}
