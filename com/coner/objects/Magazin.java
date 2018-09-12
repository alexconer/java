package com.coner.objects;

public class Magazin extends Book {
    public Magazin(){
        System.out.println("inside magazin");
        i = i + 20;
        draw();
    }

    public void draw(){
        System.out.println("draw Magazin " + i);
    }
}
