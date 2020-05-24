package com.wf.mybatisplus.gengerator.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author wf
 * @create 2020-05-24 18:25
 * @desc
 **/
@SpringBootTest
class PaymentMapperTest {
    @Autowired
    private PaymentMapper paymentMapper;

    @Test
    void test() {
        paymentMapper.selectList(null).forEach(System.out :: println);
    }
}