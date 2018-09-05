package ru.lessons.interfacing;

import java.util.Arrays;

/**
 * Created by ShishkinA on 29.08.2018.
 */
public class Test {
    public static void main(String[] args) {
        Packable b = new Book("Ronald", 200);
        Printable b1 = new Book("Carol", 400);
        Printable b2 = new Book("Tolstoy", 600);
        b.print();
        b.pack();
        b.getName();

        if (b1 instanceof Packable){
            System.out.println("b instanceof Printable");
        }

        //b.publisher = "Sir";
        System.out.println(b.publisher);
        Printable.printStamp();
        Book nb = new Book("Phillip", 250);
        Book.printDate();
        System.out.println("----->");

        Book[] ba = new Book[3];
        ba[0] = (Book) b2;
        ba[1] = (Book) b1;
        ba[2] = (Book) b;

        System.out.println(Arrays.toString(ba));
        Arrays.sort(ba);
        System.out.println(Arrays.toString(ba));
        Arrays.sort(ba, new AlphabetComparator());
        System.out.println(Arrays.toString(ba));

        int[] pp1 = {1,2,3,4,5,6,7,8,9,0};
        int[] pp2 = pp1.clone();
        pp2[5] = 5;
        System.out.println(Arrays.toString(pp1));
        System.out.println(Arrays.toString(pp2));
    }
}
