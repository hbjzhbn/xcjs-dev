package io.link.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author HBN
 * @Date 2022/4/26
 **/
@RestController
public class ConfigController {
    @Value("${spring.datasource.druid.url}")
    private String url ;

    @GetMapping("/url")
    public String getConfigInfo(){
        return url;
    }
}
