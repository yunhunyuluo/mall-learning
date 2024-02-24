package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.common.api.CommonResult;
import com.linsh.mall.tiny.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author linsh
 * @description 前台订单管理Service
 * @since 2024-02-22
 */


public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}

