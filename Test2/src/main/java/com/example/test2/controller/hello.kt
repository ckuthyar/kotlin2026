package com.example.test2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class hello {
    @GetMapping("/hello")
    fun hello(): String{
        return "hello"
    }
}