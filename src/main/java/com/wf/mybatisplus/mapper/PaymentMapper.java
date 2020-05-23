package com.wf.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wf.mybatisplus.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wf
 * @create 2020-05-23 16:15
 * @desc
 **/
// @Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
    @Select("select p.* from payment p")
    List<Payment> listPayment();
}
