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

        MyArrays ar2 = new MyArrays(new int[]{2,5,3,1,9,6,4,8,7});
    }
}
