package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class QueueService {
    Node front;
    Node rear;

    public QueueService() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            //System.out.println("hi");
            front.next = rear;
        } else {

            rear.next = newNode;
            rear = rear.next;
        }

    }

    public ArrayList<Integer> Display() {
        ArrayList<Integer>al=new ArrayList<>();
        while (front != null) {
            al.add(front.data);
            System.out.println(front.data);
            front = front.next;
        }
        return al;
    }

    public void dequeue() {
        while (front != null) {
            front = front.next;

        }
    }
}




