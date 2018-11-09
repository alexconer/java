package ru.lessons.except;

/**
 * Created by ShishkinA on 09.11.2018.
 */
public class AssertTest {
    public static void main(String[] args) {

        try {
            test(-1);
        } catch (Exception e) {
            System.out.println("hello " + e.getMessage());
        }
    }
    static void test(int a){
        assert(a > 0);
        System.out.println(a);
    }
}
