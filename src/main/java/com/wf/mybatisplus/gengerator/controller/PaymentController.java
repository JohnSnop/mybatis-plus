package com.wf.mybatisplus.gengerator.controller;


import com.wf.mybatisplus.gengerator.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wf
 * @since 2020-05-24
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("index")
    public String index(Map<String, Object> map) {
        map.put("payments", paymentService.list());
        return "index";
    }
}

