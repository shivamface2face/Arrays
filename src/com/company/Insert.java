package com.company;

public class Insert {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};

        int index=2;
        int x=12;

        InsertT(arr,index,x);

    }

   static void InsertT(int[] newArr, int index,int x) {

        int i;
        if (index>=0 && index<= newArr.length){
            for ( i= newArr.length-1;i>index;i--){
                newArr[i]=newArr[i-1];
            }
            newArr[index]=x;

        }



       for (int j = 0; j < newArr.length; j++) {
           System.out.println(newArr[j]);
       }
    }
}
