package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {
    String rev="anu";
    String empty="";
    public String reverseCall(){
        for (int i=rev.length()-1;i>=0;i--){
            empty +=rev.charAt(i);
        }
        return empty;


    }
}
