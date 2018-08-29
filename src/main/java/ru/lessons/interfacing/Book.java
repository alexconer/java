package ru.lessons.interfacing;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public class Book extends Paper {

    public Book(String a, int s) {
        super(a, s);
    }

    public void print() {
        printAuthor();
        System.out.println("sheet count (" + getSheet() + ")"  );
    }
}
