package com.coner.algoritms;

import java.util.Arrays;

public class MyArrays {

    private int[] data;

    public MyArrays(int[] ar){
        data = ar;
    }

    public void invert (){
        for (int i = 0; i < data.length/2; i++){
            int tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;
        }
    }

    public void invertRecursion(){
        invertRecursion(0);
    }

    private void invertRecursion(int i){
        if (i < data.length/2){
            int tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;
            invertRecursion(i + 1);
        }
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }
}
