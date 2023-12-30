package com.linsh.mall.tiny.common.api;

/**
 * @author linsh
 * @description 封装API的错误码
 * @since 2023-12-23
 */


public interface IErrorCode {
    long getCode();

    String getMessage();
}
