package com.example.demo.Controller;

import com.example.demo.Service.ReverseService;
import com.example.demo.Service.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class SortController {

    @Autowired
    private Sort sortService;


    @GetMapping("/sort")
    public int[] getSortedArray() {
        return sortService.sortValue();
    }


}
