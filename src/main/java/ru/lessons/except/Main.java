package ru.lessons.except;

/**
 * Created by ShishkinA on 09.10.2018.
 */
public class Main {

    public static void test2() throws Exception {

        try (Res r = new Res(); Res2 r2 = new Res2()){
            int x = 1 / 0;
        } catch (Exception e){
            System.out.println(e.getMessage());
            Exception se = new TestException1("test2 error " + e.getMessage());
            se.initCause(e);
            throw se;
            //throw e;
        } finally {
            System.out.println("final test2");
        }

    }

    public static void test1(){
        Error e = new Error("hello1");
        throw e;
    }

    public static void main(String[] args) {
        Throwable t;
        Error ep = new Error("hello");
        Exception ex;

        try{
            int x = 1 / 0;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("<------1-------->");
        //throw e;
        try {
            test2();
        }
        catch (Error | Exception e) {
            System.out.println(e.getClass().getName() + " " + e.getMessage());
            Throwable[] sar = e.getSuppressed();
            for (Throwable sel : sar){
                System.out.println("suppressed " + e.getMessage());
            }
        } catch (Throwable e){
            System.out.println("Throwable " + e.getMessage());
        } finally {


            System.out.println("main finally");
        }
        System.out.println("<-----2-------->");

        try{
            int x = 1 / 0;
        } finally {
            System.out.println("hello");
        }

        System.out.println("<-----3-------->");

        //System.out.println(e.getMessage());
        System.out.println("<-------------->");
    }
}
