package com.stock_analyze.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @PostMapping("/index")
    public ResponseEntity<String> showIndexData(@PathVariable(value = "date") String date){
        System.out.println("Test");
        return ResponseEntity.ok("Hello World"+date+"test");
    }
}
