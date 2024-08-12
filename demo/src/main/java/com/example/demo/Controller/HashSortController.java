package com.example.demo.Controller;

import com.example.demo.Service.HashSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HashSortController {
    @Autowired
    public HashSort hashSort;

    @GetMapping("/getvalue")
    public Map<Integer,String> getLM(){
        HashSort hashSort=new HashSort();
        return hashSort.getHashMap();
    }
}
