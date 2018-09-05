package ru.lessons.interfacing;

import java.util.Comparator;

/**
 * Created by ShishkinA on 05.09.2018.
 */
public class AlphabetComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
