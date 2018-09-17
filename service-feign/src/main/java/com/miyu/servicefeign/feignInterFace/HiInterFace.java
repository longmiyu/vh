package com.miyu.servicefeign.feignInterFace;

import com.miyu.servicefeign.controller.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi",fallback = RemoteHystrix.class)
public interface HiInterFace {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String  sayHiFromClientOne();
}
