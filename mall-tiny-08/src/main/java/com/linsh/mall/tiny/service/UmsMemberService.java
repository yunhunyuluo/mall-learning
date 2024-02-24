package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.common.api.CommonResult;

/**
 * @author linsh
 * @description 会员管理Service
 * @since 2024-01-13
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
