package com.link.springcloud.controller;

import com.link.springcloud.entities.CommonResult;
import com.link.springcloud.entities.Payment;
import com.link.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author HBN
 * @Date 2022/1/13
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("********插入结果：" + result);

        if (result > 0){
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);

        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("********查询结果：" + result);

        if (result != null){
            return new CommonResult(200,"查询成功",result);
        }else {
            return new CommonResult(444,"查询失败",null);

        }
    }
}
