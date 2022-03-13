package com.company;

public class CheckSorted {
    public static void main(String[] args) {
      int arr[]={12,45,23,67};
        System.out.println(check(arr));
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
