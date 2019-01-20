package com.coner.procedural;

import com.coner.algoritms.MyArrays;

import java.util.Arrays;

public class App00 {
    public static void main(String[] args) {
        System.out.println("o = " + new Object());
        MyArrays ar = new MyArrays(new int[]{1,2,3,4,5,6,7,8,9});
        ar.print();
        ar.invert();
        ar.print();
        ar.invertRecursion();
        ar.print();
        System.out.println("sort---->");
        MyArrays ar2 = new MyArrays(new int[]{2,5,3,1,9,6,4,8,7});
        ar2.sortSelection();
        ar2.print();
        System.out.println("sort Insertion---->");
        MyArrays ar3 = new MyArrays(new int[]{2,5,3,1,9,6,4,8,7});
        ar3.sortInsertion();
        ar3.print();

        System.out.println("sort fast Insertion----->");
        MyArrays ar4 = new MyArrays(new int[]{2,1,5,3,9,6,4,8,7});
        ar4.fsortInsertion();
        ar4.print();

        System.out.println("test System.arraycopy----->");
        int[] a1 = {1,2,3,4,5,6,7,8,9,10};
        int[] a2 = {2};
        //System.arraycopy(a2, 0, a1, 4, 5);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        int p = Arrays.binarySearch(a2, 1);
        System.out.println(p);


        //System.out.println(ar4.binarySearch(3, 0, ar4.length()));
        //System.out.println(ar4.binarySearch(6, 0, ar4.length()));
        //System.out.println(ar4.binarySearch(11, 0, ar4.length()));
        //System.out.println(Arrays.binarySearch(ar4.getData(),0,1,1));
        //System.arraycopy(ar4.getData(), 0, ar4.getData(), 1, 1);
        //ar4.print();
    }
}
