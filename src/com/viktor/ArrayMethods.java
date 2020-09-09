package com.viktor;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethods {

    public int summKr(int[] arr, int k) {

        int summ = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] %k ==0) {
                summ+=arr[i];
            }
        }
        System.out.println(summ);
        return summ;
    }

    public int summKr(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        return list.size();
    }

    public int[] summKr2(int[] arr) {

        int size=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0) {
                size++;
            }
        }

        int[] arrayFiltered = new int[size];
        int temp=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0) {
                arrayFiltered[temp]=arr[i];
                System.out.println(arr[i]);
                temp++;
            }
        }
//        System.out.println("Size is: " + arrayFiltered.length);
        return arrayFiltered;
    }

    public int[] changeArray(int[] arr) {
        for (int i=0; i<arr.length; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    public int[] count(int[] array) {
        int[] count = new int[]{0,0,0};
        int size = array.length;
        for (int i=0; i<size; i++) {
            if(array[i]>0) {
                count[0]++;
            } else if (array[i]==0){
                count[1]++;
            } else count[2]++;


        }
        return count;
    }
}
