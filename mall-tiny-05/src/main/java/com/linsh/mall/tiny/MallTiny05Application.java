package com.linsh.mall.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linsh
 * @description
 * @since 2024-02-17
 */

@SpringBootApplication
public class MallTiny05Application {
    public static void main(String[] args) {
        SpringApplication.run(MallTiny05Application.class, args);
        /**
         * 注: 运行该项目前, 先打开运行Elasticsearch服务器,
         * 否则会报出异常:在创建名为esProductController的bean时，
         * 由于其依赖的esProductService bean无法创建，导致整个流程失败。
         * 进一步追踪，esProductService依赖的productRepository bean也无法创建，
         * 因为EsProductRepository的初始化方法抛出了异常。
         */
    }
}