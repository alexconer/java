package ru.lessons.inheritance;

/**
 * Created by ShishkinA on 27.07.2018.
 */

import ru.lessons.utils.Print;

public class Main {
    public static void main(String[] args) {
//        User u1 = new User("Alex");
//        u1.setSalary(1000);
//        Manager u2 = new Manager("John");
//        u2.setSalary(1000);
//        u2.setBonus(500);
//
//        User assistant = new Assistant("Vlad", u2);
//
//
//        System.out.println(u1.getSalary());
//        System.out.println(u2.getSalary());
//
//        Print.println("Hello");
//        System.out.println(System.getProperty("java.ext.dirs"));
//
//        System.out.println(assistant.name);
        Manager u2 = new Manager("John");
        System.out.println(u2.getName());
        System.out.println(u2.name);
    }
}
