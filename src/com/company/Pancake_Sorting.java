package com.company;

/**
 * Created by ggorantla on 7/27/2014.
 */
public class Pancake_Sorting {
    public static int findMax(int[] arr, int x){
        int maxI = 0;
        for(int i = 1; i <= x ; i++)
            if(arr[maxI] < arr[i])
                maxI = i;

        return maxI;
    }
    public static void flip(int[] arr, int end){
        int start = 0;
        //System.out.println(start + " " + end);
        while (start < end){
            //System.out.println(arr[start] + " " + arr[end]);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void pancakeSorting(int[] arr){

        for(int curSize = arr.length-1; curSize >= 0; curSize--){
            int mi = findMax(arr,curSize);
            //System.out.println(mi);
            if(mi != curSize){
                flip(arr,mi);
                flip(arr,curSize);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {23, 10, 20, 11, 12, 6, 7};
        pancakeSorting(arr);
        for (int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]);
    }
}
