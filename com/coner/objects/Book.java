package com.coner.objects;

public class Book extends Paper {
    public Book(){
        System.out.println("inside Book");
        i = 10;
        draw();
    }

    public String draw(int i) {
        System.out.println("draw Book " + i);
        return "";
    }
}
