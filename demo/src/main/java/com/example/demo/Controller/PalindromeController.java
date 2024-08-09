package com.example.demo.Controller;

import com.example.demo.Service.Palindrome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PalindromeController {
    @Autowired
    public Palindrome palindrome;

    @GetMapping("/palindrome")
    public Boolean getPalindromeChecker(){
        return palindrome.PalindromeOrNot();
    }

   
    }

}
