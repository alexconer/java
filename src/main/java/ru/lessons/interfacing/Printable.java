package ru.lessons.interfacing;

import java.util.Date;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public interface Printable {

    String publisher = "WilliamsBook";

    void print();

    static void printStamp(){
        System.out.println(new Date());
    }

    default void getName(){
        System.out.println(getClass().getName());
    }
}
