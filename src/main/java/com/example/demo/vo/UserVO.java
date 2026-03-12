package com.example.demo.vo;

import lombok.Data;

/**
 * 用户VO类
 */
@Data
public class UserVO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别（0-未知，1-男，2-女）
     */
    private Integer gender;

    /**
     * 状态（0-禁用，1-启用）
     */
    private Integer status;

}