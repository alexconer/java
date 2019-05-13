package com.coner.collection;

import java.util.*;

public class T1 {

    public static void main(String[] args) {
        List c1 = T1.<String>create("1", "2", "3", "4", "5");
        List c2 = T1.<String>create("7", "8", "3");

        System.out.println("foreach -->");
        print(c1);
        System.out.println("iterator -->");
        for (Iterator it = c1.iterator(); it.hasNext();){
            System.out.println(it.next() + " ");
        }

        if(c1.containsAll(c2)){
            System.out.println("c1.containsAll(c2)");
        }

        System.out.println("add all");
        c1.addAll(c2);
        print(c1);

        System.out.println("shuffle");
        Collections.shuffle(c1);
        print(c1);

        System.out.println("reverce");
        Collections.reverse(c1);
        print(c1);

        System.out.println("rotate");
        Collections.rotate(c1, 2);
        print(c1);

        System.out.println("swap");
        Collections.swap(c1, 2, 5);
        print(c1);

        System.out.println("replace");
        Collections.replaceAll(c1, "1", "99");
        print(c1);

        System.out.println("remove all");
        c1.removeAll(c2);
        print(c1);

        System.out.println("retain");
        c1.retainAll(c2);
        print(c1);

        System.out.println("remove 1");
        c1.remove("1");
        print(c1);

    }

    static void print(Collection c){
        for (Object o : c) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static <T> List<T> create(T ... ar){
        List<T> result = new ArrayList<>();
        for (T t: ar){
            result.add(t);
        }
        return result;
    }
}
