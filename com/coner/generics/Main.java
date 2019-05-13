package com.coner.generics;

public class Main {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<>("Hello");
        g1.showType();
        Gen<Integer> g2 = new Gen<>(100);
        System.out.println(g2.getObject());
        g2.showType();
    }
}

class Gen<T>{
    private T ob;

    Gen(){
        ob = null;
    }

    Gen(T o){
        ob = o;
    }
    public T getObject(){
        return ob;
    }
    public void showType(){
        System.out.println(ob.getClass().getName());
    }
}

class Gen2<T> extends Gen<T>{

}

class Gen3 extends Gen<String>{

}
