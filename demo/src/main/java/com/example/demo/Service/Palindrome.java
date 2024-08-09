package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class Palindrome {
    String reversed="";
    String value="mom";
    public Boolean PalindromeOrNot(){

        for(int i=value.length()-1;i>=0;i--){
            reversed+=value.charAt(i);

        }
        if(reversed==value){
            return true;
        }
        return false;
    }
}
