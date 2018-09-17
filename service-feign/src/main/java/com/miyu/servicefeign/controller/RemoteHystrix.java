package com.miyu.servicefeign.controller;

import com.miyu.servicefeign.feignInterFace.HiInterFace;
import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements HiInterFace {
    @Override
    public String sayHiFromClientOne() {
        return   "hello" +""+", this messge send failed ";
    }
}
