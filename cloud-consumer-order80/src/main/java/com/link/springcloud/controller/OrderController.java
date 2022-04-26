package com.link.springcloud.controller;

import com.link.springcloud.entities.CommonResult;
import com.link.springcloud.entities.Payment;
import com.sun.xml.internal.ws.message.PayloadElementSniffer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author HBN
 * @Date 2022/1/14
 **/
@RestController
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8004";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
