package com.company;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr ={3,6,6,8,8,12,15,15,15,20};
       duplicate(arr);

    }

         static void duplicate(int[] arr) {
              int lastDupli=0;
             for (int i = 0; i < arr.length ; i++) {
                 if (arr[i]==arr[i+1]&& arr[i]!=lastDupli){
                     System.out.println(arr[i]);
                     lastDupli=arr[i];
                 }
             }
    }
}
