package com.linsh.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author linsh
 * @description MyBatis配置类
 * @since 2024-01-13
 */
@Configuration
@MapperScan("com.linsh.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
