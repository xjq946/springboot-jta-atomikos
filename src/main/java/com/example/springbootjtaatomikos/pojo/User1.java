package com.example.springbootjtaatomikos.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xiejiqing
 * @description
 * @create 2019/10/19 18:27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User1 implements Serializable {

    private Integer id;

    private String username;
}
