package com.wf.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wf.mybatisplus.entity.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wf
 * @create 2020-05-23 16:16
 * @desc
 **/
@SpringBootTest
class PaymentMapperTest {

    @Resource
    private PaymentMapper paymentMapper;

    @Test
    void listPayment() {
        paymentMapper.listPayment().forEach(System.out :: println);
    }

    @Test
    void selectList() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        // wrapper.order
        paymentMapper.selectList(wrapper).forEach(System.out::println);
    }

    @Test
    void selectPage() {
        Page<Payment> page = new Page<>(0, 5);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        // wrapper.order
        Page<Payment> page1 = paymentMapper.selectPage(page, null);
        System.out.println(page1.getSize());
        System.out.println(page1.getTotal());
        page1.getRecords().forEach(System.out::println);
    }

    @Test
    void test() {
        paymentMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        Payment payment = new Payment();
        payment.setSerial("mybatis-plus");
        paymentMapper.insert(payment);
    }

    @Test
    void update() {
        Payment payment = paymentMapper.selectById(1264124433375817729L);
        payment.setSerial("mybatis-plus----");
        paymentMapper.updateById(payment);
    }
}