package com.company;

public class MergingOfArray {
    public static void main(String[] args) {
        int[] arr1 ={3,8,16,20,25};
        int[] arr2={4,10,12,22,23};
        mergeArrays(arr1,arr2);


    }

     static void mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while (i< arr1.length&& j< arr2.length){
            if (arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else {
                arr3[k++]=arr2[j++];
            }

        }
         for (;i< arr1.length;i++){
             arr3[k++]=arr1[i++];

         }
         for (;i< arr2.length;i++){
             arr3[k++]=arr2[j++];

         }

         for (int l = 0; l < arr3.length; l++) {
             System.out.print(arr3[l]+" ");
         }



    }
}
