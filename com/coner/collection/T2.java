package com.coner.collection;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        a.add("Piter");
        a.add(null);
        a.add(2, "Tom");
        T1.print(a);

        Deque<String> q = new LinkedList<>();
        q.addLast("Piter");
        q.add(null);
        q.add("Tom");
        T1.print(q);

        Set<String> s = new TreeSet<>((s1, s2) -> s2.length() - s1.length());
        s.add("Piter");
        s.add("Tom");
        s.add("Alice");
        T1.print(s);


    }
}
