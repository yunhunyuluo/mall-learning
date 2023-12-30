package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author linsh
 * @description
 * @since 2023-12-24
 */


public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
