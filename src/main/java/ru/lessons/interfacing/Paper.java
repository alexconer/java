package ru.lessons.interfacing;

import java.util.Date;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public abstract class Paper implements Packable, Cloneable {
    private int sheet;
    private String author;

    public Paper(String a, int s){
        author = a;
        sheet = s;
    }

    public void printAuthor(){
        System.out.println(author);
    }

    public int getSheet() {
        return sheet;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "sheet=" + sheet +
                ", author='" + author + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public static void printDate(){
        System.out.println(new Date());
    }
}
