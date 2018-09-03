package ru.lessons.interfacing;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public abstract class Paper implements Printable {
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
}
