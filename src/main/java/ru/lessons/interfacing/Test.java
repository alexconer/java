package ru.lessons.interfacing;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public class Test {
    public static void main(String[] args) {
        Printable b = new Book("Ronald", 200);
        b.print();
        //b.publisher = "Sir";
        System.out.println(b.publisher);
    }
}
