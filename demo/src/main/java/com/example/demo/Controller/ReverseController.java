package com.example.demo.Controller;

import com.example.demo.Service.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @Autowired
    private ReverseService reverseService;


    @GetMapping("/reverse")
    public String getReversedString() {
        return reverseService.reverseCall();
    }
}
