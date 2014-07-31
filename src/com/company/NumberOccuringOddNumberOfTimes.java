package com.company;

/**
 * Created by ggorantla on 7/31/2014.
 * Method 1: XOR gate  1 Xor 1 = 0
 *                     0 Xor 0 = 0
 *                     1 Xor 0 = 1
 *                     0 Xor 1 = 1
 *
 *           0 Xor Anything = Anything
 * Source : http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 */
public class NumberOccuringOddNumberOfTimes {
    public int numberOccuringOddNumberOfTimes(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length ; i++)
            res ^= arr[i];
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        NumberOccuringOddNumberOfTimes dummy = new NumberOccuringOddNumberOfTimes();
        System.out.println(dummy.numberOccuringOddNumberOfTimes(arr));
    }
}
