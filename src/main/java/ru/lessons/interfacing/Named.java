package ru.lessons.interfacing;

/**
 * Created by ShishkinA on 05.09.2018.
 */
public interface Named {
    default void getName(){
        System.out.println(getClass().getName());
    }
}
