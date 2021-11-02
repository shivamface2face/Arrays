package com.company;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,6,7};
         int ans= missingNumber(arr);
        System.out.println(ans);
    }

       static int missingNumber(int[] arr) {
           Arrays.sort(arr);
           for (int i = 0; i < arr.length; i++) {
              if (arr[i]!=i){
                  return i;
               }
           }

             return -1;
    }
}
