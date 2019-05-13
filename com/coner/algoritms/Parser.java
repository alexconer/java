package com.coner.algoritms;

public class Parser {
    public static int parse(String req){
        int len = req.length();
        if (len == 0) return 0;
        if (req.startsWith("(")){

        } else {
            int k = 0;
            StringBuilder sb = new StringBuilder();
            while (k < len){

            }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Parser.parse("123"));
        System.out.println(Parser.parse("3*2"));
    }
}
