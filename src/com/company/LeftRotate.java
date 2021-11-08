package com.company;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[]={6,3,8,5,9};

      leftRotatea(arr);


    }

         static void leftRotatea(int[] arr) {
        int temp=arr[0];
             for (int i = 0; i <arr.length-1 ; i++) {
                 arr[i]=arr[i+1];
             }

             arr[arr.length-1]=temp;

             for (int i=0;i< arr.length;i++){
                 System.out.println(arr[i]);
             }

    }
}
