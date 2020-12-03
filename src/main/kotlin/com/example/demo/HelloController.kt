package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    
    @GetMapping("/api/hello") 
    fun getHello(): ResponseEntity<String> = ResponseEntity.ok("Hello")
    
}