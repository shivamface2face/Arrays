package com.company;

import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int index=1;
        Deletee(arr,index);
        int n= arr.length;
       int ans = del2(arr,n,4);
        System.out.println(ans);


    }

     static int del2(int[] arr, int n, int x) {
        int i;
         for ( i = 0; i < n; i++) {
             if (arr[i]==x){
                 break;
             }
             
         }
         if (i==n){
             return n;
         }
         for (int j = i; j < n-1; j++) {
             arr[j]=arr[j+1];
         }
        return (n-1);

    }

    static void Deletee(int[] arr, int index) {
        int x=arr[index];
        for (int i=index;i< arr.length-1;i++){
            arr[i]=arr[i+1];

        }
         for (int i = 0; i < arr.length-1; i++) {
//             System.out.println(arr[i]);
         }
    }
}
