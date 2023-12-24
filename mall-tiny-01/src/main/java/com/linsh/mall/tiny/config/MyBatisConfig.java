package com.linsh.mall.tiny.config;

/**
 * @author linsh
 * @description MyBatis配置类
 * @since 2023-12-23
 */


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.linsh.mall.tiny.mbg.mapper","com.linsh.mall.tiny.dao"})
public class MyBatisConfig {

}