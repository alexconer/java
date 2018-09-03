package ru.lessons.interfacing;

import java.util.Arrays;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public class Test {
    public static void main(String[] args) {
        Printable b = new Book("Ronald", 200);
        Printable b1 = new Book("Carol", 400);
        Printable b2 = new Book("Tolstoy", 600);
        b.print();

        //b.publisher = "Sir";
        System.out.println(b.publisher);

        Book[] ba = new Book[3];
        ba[0] = (Book) b2;
        ba[1] = (Book) b1;
        ba[2] = (Book) b;

        System.out.println(Arrays.toString(ba));
        Arrays.sort(ba);
        System.out.println(Arrays.toString(ba));

    }
}
