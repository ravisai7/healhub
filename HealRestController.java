package com.myapp.springboot.demo.healhub.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealRestController {

    //expose '/'end point  that return "Path to Heal"


@GetMapping("/")
    public String sayHello() {
    return "Path to Heal";

}

}
