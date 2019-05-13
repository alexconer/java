package com.coner.algoritms;

import java.util.Arrays;

public class MyArrays {

    private int[] data;

    public MyArrays(int[] ar){
        data = ar;
    }

    public int length(){
        return data.length;
    }
    public int[] getData(){
        return data;
    }

    public void insert(int val){
        // inserting
    }

    public boolean delete(int val){
        //deleteing
        return true;
    }

    public boolean find(int val){
        return true;
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
    public void sortBubble(){
        int step = 0;
        for (int i = data.length - 1; i >= 0 ; i--){
            for (int j = i - 1; j >= 0; j--){
                if (data[j] > data[i]){
                    swap(i, j);
                    step ++;
                }
            }
        }
        System.out.println(step);
    }

    public void sortSelection(){
        int step = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[k] > data[j]){
                    k = j;
                }
            }
            if (k!=i){
                swap(i, k);
                step++;
            }
        }
        System.out.println(step);
    }

    public void sortInsertion(){
        int step = 0;
        for (int i = 1; i < data.length; i++){
            int tmp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] >= tmp){
                data[j] = data[j - 1];
                j--;
            }
            data[j] = tmp;
            step++;
        }
        System.out.println(step);
    }

    public void fsortInsertion(){
        int step = 0;
        for (int i = 1; i < data.length; i++){
            int tmp = data[i];
            int pos = binarySearch(tmp,0,i);
            if (pos < 0) pos = -pos - 1;
            System.arraycopy(data, pos, data, pos + 1, i -pos);
            data[pos] = tmp;
            step++;
        }
        System.out.println(step);
    }

    public int binarySearch(int el, int left, int right){
        int low = left;
        int high = right - 1;

        while (high >= low){
            int mid = low + (high - low)/2;
            if (data[mid] < el)
                low = mid + 1;
            else if (data[mid] > el)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    public int[] merge(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int ai = 0, bi =0;

        while (ai + bi < res.length){
            if (a[ai] < b[bi]){
                res[ai + bi] = a[ai++];
            } else {
                res[ai + bi] = b[bi++];
            }
        }
        return res;
    }
}
