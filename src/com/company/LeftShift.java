package com.company;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      leftShif(arr);


    }

      static void leftShif(int[] arr) {

          for (int i = 1; i > arr.length-1 ; i--) {
              arr[i]=arr[i+1];
          }
           arr[arr.length]=0;

          System.out.println(Arrays.toString(arr));
    }
}
