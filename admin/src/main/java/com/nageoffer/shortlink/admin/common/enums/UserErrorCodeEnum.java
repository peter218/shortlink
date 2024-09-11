package com.nageoffer.shortlink.admin.common.enums;

import com.nageoffer.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * title:
 * author:Lv Haoyuan
 * date:2024-09-11
 * description:
 */
public enum UserErrorCodeEnum implements IErrorCode {
    USER_NONE("B000200","用户记录不存在"),
    USER_EXIST("B000200","用户记录已存在");
    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
