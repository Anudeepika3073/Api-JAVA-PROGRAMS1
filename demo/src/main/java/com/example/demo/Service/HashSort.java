package com.example.demo.Service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.boot.env.ConfigTreePropertySource;
import org.springframework.stereotype.Service;

import java.security.Key;

import java.util.*;
@Service
public class HashSort {

    public  Map<Integer,String> getHashMap() {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(1,"anu");
        maps.put(3,"deep");
        maps.put(2,"shu");
        TreeMap<Integer,String>sorted=new TreeMap<>(maps);


       return sorted;

//    public LinkedHashMap<String,Integer> sort(){
//        ArrayList<Integer>List=new ArrayList<>();
//        LinkedHashMap<String,Integer>Lm=new LinkedHashMap<>();
//
//        Lm.put("anu",1);
//        Lm.put("shu",3);
//        Lm.put("dep",2);
//        Lm.put("zhu",4);
//
//
//
//        return Lm;
// }

    }


}
