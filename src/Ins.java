import java.util.Arrays;

public class Ins {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};


       int ans[]=InsertElm(arr,4,15);
        System.out.println(Arrays.toString(ans));




    }

     static int[] InsertElm(int[] arr, int index, int x) {
        int newArr[]=new int[arr.length+1];
        int i;
        for (i= newArr.length;i>index;i--){
           newArr[i]=newArr[i++];
        }
        newArr[index]=x;

          return newArr;


    }


}
