package ru.lessons.except;

import java.io.File;

/**
 * Created by ShishkinA on 29.10.2018.
 */
public class Test1 {

    static int test1(){
        try {
            throw new NullPointerException("hello error");
            //return 1;
        } finally {
            //throw new NullPointerException("hello 2 error");
            System.out.println("fin1");
            return -1;
        }

    }

    public static void main(String[] args) {
        try {
            int p = test1();
            System.out.println(p);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("final");
        }
    }
}
