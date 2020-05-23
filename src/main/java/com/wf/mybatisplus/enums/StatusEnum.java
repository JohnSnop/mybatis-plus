package com.wf.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author wf
 * @create 2020-05-23 18:11
 * @desc
 **/
public enum StatusEnum {
    WORK(1, "上班"),
    REST(0, "休息");

    @EnumValue
    private Integer code;
    private String desc;

    StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
