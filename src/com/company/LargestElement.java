package com.company;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,32,4,5};
      int ans=  getLargest(arr);
      int an=get(arr);
        System.out.println(an);
        System.out.println(ans);
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


    static int getLargest(int[] arr) {

          for (int i = 0; i < arr.length; i++) {
              boolean flag=true;
              for (int j = 0; j < arr.length; j++) {
                  if (arr[j]>arr[i]){
                      flag=false;
                      break;
                  }
              }
              if (flag==true){
                 return i;
              }

          }

          return -1;
    }
}
