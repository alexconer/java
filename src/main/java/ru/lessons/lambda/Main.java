package ru.lessons.lambda;

/**
 * Created by ShishkinA on 13.11.2018.
 */
public class Main {
    static int p1 = 10;
    public static void main(String[] args) throws Exception {
        Printer p = new Printer();
        Printable pr = System.out::println;
        pr.test("hello");
        pr = p::print;
        pr.test("hello");
        pr = s -> {
            System.out.println("hello " + s);
            throw new Exception("fuck");
        };

        try {
            test(pr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //test(Printer::print, "hello");
        System.out.println("end");
    }

    static void test(Printable p) throws Exception {
        p.test("s");
    }
}

class Printer {
    public void print(String s){
        System.out.println(s);
    }
}

@FunctionalInterface
interface Printable {
    void test(String s) throws Exception;
}