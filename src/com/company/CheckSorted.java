package com.company;

public class CheckSorted {
    public static void main(String[] args) {
      int arr[]={12,45,23,67};
        System.out.println(check(arr));
        System.out.println(ch2(arr));
    }

     static boolean ch2(int[] arr) {
         for (int i = 1; i < arr.length; i++) {
             if (arr[i]<arr[i-1]){
                 return false;
             }

         }
         return true;
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    return false;
                }

            }

        }
        return true;
    }
}
