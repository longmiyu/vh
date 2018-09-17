package com.miyu.servicefeign.controller;

import com.miyu.servicefeign.feignInterFace.HiInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    HiInterFace hi;

    @RequestMapping("/hi")
    public String hi(){
        return hi.sayHiFromClientOne();
    }
}
