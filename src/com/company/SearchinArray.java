package com.company;

public class SearchinArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 56};
        System.out.println(serc(arr, 2));
    }

    static boolean serc(int[] arr, int n) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == n) {
                return true;
            }

        }

        return false;

}
}