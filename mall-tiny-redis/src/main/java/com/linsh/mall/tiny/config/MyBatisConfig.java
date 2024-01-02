package com.linsh.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description MyBatis配置类
 */

@Configuration
@MapperScan("com.linsh.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
