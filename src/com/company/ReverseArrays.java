package com.company;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reversre(arr);
    }

    static void reversre(int[] arr) {
        int arr1[]=new int [arr.length];
       for (int i=arr.length-1,j=0;i>=0;i--,j++){
           arr1[j]=arr[i];
       }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
