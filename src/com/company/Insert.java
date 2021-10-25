package com.company;

public class Insert {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};

        int index=2;
        int x=12;

        InsertT(arr,index,x);

    }

   static void InsertT(int[] arr, int index,int x) {
        int i;
        if (index>=0 && index<= arr.length){
            for ( i= arr.length-1;i>index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=x;

        }



       for (int j = 0; j < arr.length; j++) {
           System.out.println(arr[j]);
       }
    }
}
