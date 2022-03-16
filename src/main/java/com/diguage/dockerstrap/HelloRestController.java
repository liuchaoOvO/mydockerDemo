package com.diguage.dockerstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        log.info("Restful controller come in. current Time:"+System.currentTimeMillis());
        return "Hello my test！";
    }
}
