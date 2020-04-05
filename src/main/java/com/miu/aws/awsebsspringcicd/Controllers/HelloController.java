package com.miu.aws.awsebsspringcicd.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
    @GetMapping
    public String Hello(){
        System.out.println("hello");
        return "Hello Controller";
    }
}
