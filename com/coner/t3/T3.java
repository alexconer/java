package com.coner.t3;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);

        try {
            Scanner f = new Scanner(Paths.get("res//1.txt"));
            System.out.println(f.nextLine());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
