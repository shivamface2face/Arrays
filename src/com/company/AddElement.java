package com.company;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
//        int arr2[n]={11,22,33};
        int x=6;
        arr= insert(arr,x);
        int pos=2;
//         arr2=inse(arr,x,pos,n);
//        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }

    static int[] inse(int[] arr, int x, int pos,int n) {
        int index=pos-1;
        for (int i = arr.length-1; i >=index ; i--) {
            arr[i+1]=arr[i];

        }
        arr[index]=x;
        return arr;

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
