package com.wf.mybatisplus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author wf
 * @create 2020-09-19 20:38
 * @desc
 **/
public enum AgeEnum implements IEnum<Integer> {
    ONE(1, "一岁"),
    TWO(2, "两岁"),
    THREE(3, "三岁");

    private Integer age;
    private String msg;

    AgeEnum(Integer age, String msg) {
        this.age = age;
        this.msg = msg;
    }
    @Override
    public Integer getValue() {
        return this.age;
    }
}
