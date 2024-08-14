package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
@Service

public class QueueService {
    Node front;
    Node rear;

    public QueueService( ){
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            //System.out.println("hi");
            front.next=rear;
        } else {

            rear.next=newNode;
            rear=rear.next;
        }

    }
    public void Display(){
     while(front!=null)
     {
         System.out.println(front.data);
         front=front.next;
     }
    }

}

