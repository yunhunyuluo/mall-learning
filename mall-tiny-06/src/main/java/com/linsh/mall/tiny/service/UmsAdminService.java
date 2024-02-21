package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.domain.AdminUserDetails;
import com.linsh.mall.tiny.domain.UmsResource;

import java.util.List;

/**
 * @author linsh
 * @description 后台用户管理Service
 * @since 2024-01-13
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 获取所以权限列表
     */
    List<UmsResource> getResourceList();

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
