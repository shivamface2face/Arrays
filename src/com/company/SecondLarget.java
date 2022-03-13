package com.company;

public class SecondLarget {
    public static void main(String[] args) {
        int arr[]={1,2,32,4,5};
        int ans=  get(arr);
        int ge=Second(arr);
        System.out.println(ge);


    }

      static int Second(int[] arr) {
        int large=get(arr);
        int res=-1;
          for (int i = 0; i <arr.length ; i++) {
              if (arr[i]!=large){
                  res=i;
              }else if(arr[i]>arr[res]){
                   res=i;
              }

          }
          return res;
    }

    static int get(int[] arr) {
        int res=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
}
