package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * title:
 * author:Lv Haoyuan
 * date:2024-09-09
 * description:用户返回参数实体
 */
@Data
public class UserActualRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
