package com.company;

public class Delete {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int index=1;
        Deletee(arr,index);

    }

     static void Deletee(int[] arr, int index) {
        int x=arr[index];
        for (int i=index;i< arr.length-1;i++){
            arr[i]=arr[i+1];

        }
         for (int i = 0; i < arr.length-1; i++) {
             System.out.println(arr[i]);
         }
    }
}
