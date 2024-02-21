package com.linsh.mall.tiny.service;

import com.linsh.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import java.util.List;

/**
 * @author linsh
 * @description 会员浏览记录管理Service
 * @since 2024-02-20
 */


public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
