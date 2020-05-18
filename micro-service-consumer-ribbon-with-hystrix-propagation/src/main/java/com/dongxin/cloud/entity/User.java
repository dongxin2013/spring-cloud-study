package com.dongxin.cloud.entity;


import lombok.Data;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author DongXin
 * @date 2019-11-13
 */
@Data
public class User{

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;


}
