package ru.lessons.except;

/**
 * Created by ShishkinA on 11.10.2018.
 */
public class Res implements AutoCloseable {
    @Override
    public void close() throws Exception {
        try {
            int x = 1/0;
            System.out.println("Res was closed");
        } catch (Exception e) {
            throw new Exception("closed error : " + e.getMessage());
        }
    }
}
