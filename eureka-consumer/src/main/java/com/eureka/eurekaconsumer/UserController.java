package com.eureka.eurekaconsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ASUS
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "buy")
    public String ticket(){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return s;
    }
    @GetMapping(value = "abc")
    public String hello(){
        return "hello";
    }
}
