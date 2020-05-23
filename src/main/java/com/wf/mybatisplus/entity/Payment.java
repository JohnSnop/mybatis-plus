package com.wf.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wf.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author wf
 * @create 2020-05-23 16:13
 * @desc
 **/
@Data
@TableName("payment")
public class Payment {
    // @TableId(value = "id", type = IdType.AUTO)
    @TableId
    private Long id;
    @TableField("serial")
    // @TableField(select = false)
    private String serial;
    @TableField(exist = false)
    private String desc;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
    private StatusEnum status;
    // @TableLogic
    // private Integer deleted;
}
