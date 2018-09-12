package com.coner.objects;

public class Paper {
    public int i;
    public Paper(){
        System.out.println("inside paper");
        draw();
    }

    public void draw(){
        System.out.println("draw paper " + i);
    }
}
