package com.example.demo.Service;


import java.util.*;

public class StackService {
    public Stack hero()
    {
        Stack<Integer>st=new Stack<>();
        st.push(9);
        st.push(10);
        st.push(11);
        st.pop();
        st.peek();
        return st;
    }
}
