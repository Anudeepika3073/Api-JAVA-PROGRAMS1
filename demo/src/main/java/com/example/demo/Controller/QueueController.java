package com.example.demo.Controller;

import com.example.demo.Service.Node;
import com.example.demo.Service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;

@RestController
public class QueueController {
    @Autowired
    public QueueService queueService;
    @GetMapping("/add")
    public void getElement(){
      QueueService queueService1=new QueueService();
      queueService1.enqueue(3);
      queueService1.Display();

    }
//    @GetMapping("/DUMMY")
//    public int my(){
//        return 6;
//    }

}
