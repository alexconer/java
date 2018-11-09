package ru.lessons.except;

/**
 * Created by ShishkinA on 11.10.2018.
 */
public class Res2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Res2 was closed");
    }
}
