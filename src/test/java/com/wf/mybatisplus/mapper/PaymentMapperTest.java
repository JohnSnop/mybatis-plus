package com.wf.mybatisplus.mapper;

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