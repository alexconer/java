package com.coner.t2;

import com.coner.t1.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("start --->");
        Main1 m1 = new Main1();


        Main1.InternalStaticPublic ip1 = new Main1.InternalStaticPublic();
        ip1.test();

        Main1.InternalRegular ip2 = m1.new InternalRegular();
        ip2.test();

        System.out.println("end   --->");
    }
}
