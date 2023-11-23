package com.example.demo13

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController{

    @GetMapping("/")
    fun helloworld(): String{
        return "Hello heroku";
    }
}