package com.st.fi;

interface FunctionalInf {
    int add(int a, int b);
}

public class FITestCase {
    public static void main(String[] args) {
        FunctionalInf fn = Integer::sum;
        System.out.println(fn.add(5,6));
    }
}
