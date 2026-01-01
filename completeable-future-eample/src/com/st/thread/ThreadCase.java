package com.st.thread;

interface FunctionalInf {
    int add(int a, int b);
}
public class ThreadCase {
    public static void main(String[] args) {
        FunctionalInf fn = Integer::sum;
        System.out.println(fn.add(5,6));
    }
}
