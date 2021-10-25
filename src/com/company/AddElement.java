package com.company;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=6;
        arr= insert(arr,x);
        System.out.println(Arrays.toString(arr));
    }

     static int[] insert(int[] arr, int x) {
         int newArr[]=new int[arr.length+1];
         for (int i = 0; i < arr.length ; i++) {
            newArr[i]=arr[i];
         }
         newArr[arr.length]=x;
        return newArr;
    }
}
