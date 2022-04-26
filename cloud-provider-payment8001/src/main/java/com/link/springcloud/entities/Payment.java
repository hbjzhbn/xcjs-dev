package com.link.springcloud.entities;/**
 * @Description: TODO
 * @Author HBN
 * @Date 2022/1/13
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
