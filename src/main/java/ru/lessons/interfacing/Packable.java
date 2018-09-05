package ru.lessons.interfacing;

/**
 * Created by ShishkinA on 04.09.2018.
 */
public interface Packable extends Printable {
    void pack();

    default void print(){
        System.out.println("default print");
    }
}
