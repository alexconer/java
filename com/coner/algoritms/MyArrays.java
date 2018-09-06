package com.coner.algoritms;

import java.util.Arrays;

public class MyArrays {

    private int[] data;

    public MyArrays(int[] ar){
        data = ar;
    }

    public void invert (){
        for (int i = 0; i < data.length/2; i++){
            swap(i, data.length - i - 1);
        }
    }

    public void invertRecursion(){
        invertRecursion(0);
    }

    private void invertRecursion(int i){
        if (i < data.length/2){
            swap(i, data.length - i - 1);
            invertRecursion(i + 1);
        }
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

    private void swap(int first, int second){
            int tmp = data[first];
            data[first] = data[second];
            data[second] = tmp;
    }

    //public void sort
}
