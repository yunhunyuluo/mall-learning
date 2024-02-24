package com.linsh.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author linsh
 * @description 文件上传返回结果
 * @since 2024-02-23
 */

@Data
@EqualsAndHashCode
public class MinioUploadDto {
    @ApiModelProperty("文件访问URL")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
