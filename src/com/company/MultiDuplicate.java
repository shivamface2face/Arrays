package com.company;

public class MultiDuplicate {
    public static void main(String[] args) {
        int[] arr ={3,6,6,8,8,12,15,15,15,20};
        multipleduplicate(arr);
    }
     static void multipleduplicate(int[] arr) {

         for (int i = 0; i < arr.length-1; i++) {
             if (arr[i]==arr[i+1]){
                 int j=i+1;

                 while (arr[j]==arr[i]){
                     j++;
                 }
                 System.out.print(arr[i]+" ");
                 System.out.println(j-i);
                 i=j-1;
             }

         }
    }
}
