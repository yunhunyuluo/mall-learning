package com.linsh.mall.tiny.dao;

import com.linsh.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author linsh
 * @description 搜索系统中的商品管理自定义Dao
 * @since 2024-02-17
 */


public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
