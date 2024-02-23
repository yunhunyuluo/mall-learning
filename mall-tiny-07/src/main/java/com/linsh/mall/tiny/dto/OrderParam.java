package com.linsh.mall.tiny.dto;

import lombok.Data;

/**
 * @author linsh
 * @description 生成订单时传入的参数
 * @since 2024-02-22
 */


@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
