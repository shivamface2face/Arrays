package com.company;

public class Segragate012s {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,2,2,1,0};
        segragate(arr);
    }

     static void segragate(int[] arr) {
        int low=0,temp=0,high= arr.length -1,mid=0;
        while (mid<=high){
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;

                }
            }
        }

         for (int i = 0; i < arr.length ; i++) {
             System.out.println(arr[i]);
         }

    }


}
