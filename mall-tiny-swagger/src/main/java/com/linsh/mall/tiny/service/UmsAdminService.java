package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.domain.AdminUserDetails;

/**
 * @author linsh
 * @description
 * @since 2023-12-24
 */


public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
