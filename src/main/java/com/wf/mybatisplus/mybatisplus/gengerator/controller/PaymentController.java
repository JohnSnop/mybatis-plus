package com.wf.mybatisplus.mybatisplus.gengerator.controller;


import com.wf.mybatisplus.mybatisplus.gengerator.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wf
 * @since 2020-05-23
 */
@Controller
@RequestMapping("/gengerator/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("payments", paymentService.list());
        return modelAndView;
    }
}

