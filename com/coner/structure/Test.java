package com.coner.structure;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Node tail = new Node(1, null);
        tail = new Node(2, tail);
        tail = new Node(3, tail);
        tail = new Node(4, tail);
        tail = new Node(5, tail);

        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

        tail = genIter(1,2,3,4,5);
        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

        Node tail2 = genRec(1, 4, 7);
        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

        tail = merge(tail, tail2);
        System.out.println(toStringRec(tail));
    }

    public static String toStringIter(Node tail){
        String result = "";
        while(tail != null){
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRec(Node tail){
        return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
    }

    public static Node genIter(int... v){
        Node tail = null;
        for (int k = v.length - 1; k>=0; k--){
            tail = new Node(v[k], tail);
        }
        return tail;
    }

    public static Node genRec(int... v){
        return v.length == 0 ? null : new Node(v[0], genRec(Arrays.copyOfRange(v, 1, v.length)));
    }

    public static Node merge (Node a, Node b){
        if (a != null && b != null){
            if (a.value < b.value){
                return new Node(a.value, merge(a.next, b));
            } else {
                return new Node(b.value, merge(b.next, a));
            }
        } else {
            return a == null ? b : a;
        }
    }

    public static Node copy(Node tail){
        return tail == null ? null : new Node(tail.value, copy(tail.next) );
    }

    public static boolean isEqual(Node a, Node b){
        if (a != null && b != null){
            return (a.value == b.value) && isEqual(a.next, b.next);
        } else {
            return a == b;
        }
    }
}
