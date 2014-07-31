package com.company;

/**
 * Created by ggorantla on 7/31/2014.
 * Source : http://www.geeksforgeeks.org/find-the-missing-number/
 * Method 1: Use math formula , sum of first n natural numbers -> n(n+1)/2 ,
 *           Get the sum of all elements and substract
 * Method 2: Xor all the elements till n
 *           Xor all elements in the array and X1^X2 gives result
 * Method 3: In-place , two pass
 *          LeetCode - Thanks to Sophie for this method(n00tC0d3r)
 */
public class FindTheMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        FindTheMissingNumber dummy = new FindTheMissingNumber();
        System.out.println(dummy.Method1(arr));
        System.out.println(dummy.Method2(arr));
        System.out.println(dummy.Method3(arr));
    }

    public int Method1(int[] arr){
        int x = arr.length+1;
        int total = x*(x+1)/2;
        int sum = 0;
        for( int a : arr)
            sum += a;
        return total - sum;
    }

    public int Method2(int[] arr){
        int x1 = 0, x2  = 0;
        for( int i : arr){
            x1 ^= i;
        }
        for(int j = 1; j <= arr.length+1 ; j++)
            x2 ^=  j;
        return (x1^x2);
    }

    public int Method3(int[] arr){
        /*
           *   A[i] is positive ., A[i] > 0
           *   A[i] != i+1
           *   A[i] <= len(A) or A[i]-1 < len(A)
           *   A[A[i]-1] != A[i]
         */
         for(int i = 0; i < arr.length; i++){
             while (arr[i] > 0 && arr[i] != i+1 && arr[i] <= arr.length && arr[i] != arr[arr[i]-1]){
                 int temp = arr[arr[i]-1];
                 arr[arr[i]-1] = arr[i];
                 arr[i] = temp;
             }
         }
        int index = 0;
        while (index < arr.length && arr[index] == index+1) index++;
        return index+1;
    }

}
