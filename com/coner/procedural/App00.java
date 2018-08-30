package com.coner.procedural;

import com.coner.algoritms.MyArrays;

public class App00 {
    public static void main(String[] args) {
        System.out.println("o = " + new Object());
        MyArrays ar = new MyArrays(new int[]{1,2,3,4,5,6,7,8,9});
        ar.print();
        ar.invert();
        ar.print();
        ar.invertRecursion();
        ar.print();

    }
}
