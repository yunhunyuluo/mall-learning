package com.linsh.mall.tiny.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author linsh
 * @description Minio Bucket访问策略配置
 * @since 2024-02-23
 */


@Data
@EqualsAndHashCode
@Builder
public class BucketPolicyConfigDto {

    private String Version;
    private List<Statement> Statement;

    @Data
    @EqualsAndHashCode
    @Builder
    public static class Statement {
        private String Effect;
        private String Principal;
        private String Action;
        private String Resource;

    }
}
