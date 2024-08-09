package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class Sort {
    int[] arr={3,6,4,7};
    public int[] sortValue(){

        for(int i =0;i<arr.length-1;i++){
           for (int j=i+1;j<arr.length;j++){
               int temp=0;
               if(arr[i]>arr[j]){
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
        }
        return arr;

    }
}
