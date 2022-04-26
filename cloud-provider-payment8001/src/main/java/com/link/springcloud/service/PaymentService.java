package com.link.springcloud.service;

import com.link.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO
 * @Author HBN
 * @Date 2022/1/13
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
