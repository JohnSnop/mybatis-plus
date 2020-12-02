package com.wf.mybatisplus;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;
    @Resource(name = "wfEncryptorBean")
    private StringEncryptor stringEncryptor;

    @Test
    void contextLoads() {
        Environment environment = applicationContext.getBean(Environment.class);
        String property = environment.getProperty("spring.datasource.password");
        System.out.println(property);
        System.out.println(stringEncryptor.encrypt(property));
    }

}
