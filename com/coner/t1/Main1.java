package com.coner.t1;

import java.util.Arrays;

public class Main1 {

    enum Color {
        RED,
        BLUE,
        WHITE
    }

    private int p = 0;
    static private int ps = 100;

    public class InternalRegular{
        //private int p = 1;
        private int p2 = 2;
        public void test(){
            System.out.println(Main1.this);
            System.out.println("p = " + p + ", p2 = " + p2);
        }
    }

    static public class InternalStaticPublic{
        public void test(){
            System.out.println("ps = " + ps);
        }
        public static void staticTest(){
            System.out.println("hello static");
        }
    }

    public void testInner(){
        InternalRegular ir = new InternalRegular();
        ir.p2 = 10;
        ir.test();
    }

    public static void main(String[] args) {
        System.out.println("start --->");
        Additional ad = new Additional(){
            public void test(){
                System.out.println("hello");
            }
        };

        ad.test();

        Color color = Color.BLUE;
        System.out.println(color);
        System.out.println(Arrays.toString(Color.values()));

        Main1 m = new Main1();
        m.testInner();

        System.out.println("end   --->");
    }
}

class Additional {
    public void test(){
        System.out.println("test");
    }
}
