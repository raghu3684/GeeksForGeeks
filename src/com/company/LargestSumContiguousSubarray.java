package com.company;

/**
 * Created by ggorantla on 7/31/2014.
 * Source: http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 *
 * Method 1: Kadane's Algorithm    // Limitation : Does not work for all negative case
 *      Initialize max_so_far = 0
 *                 max_ending_here = 0
 *      Loop for each element
 *          -> max_ending_here += arr[i]
 *          if(max_ending_here = 0)
 *              reset max_ending_here to 0
 *          if(max_so_far < max_ending_here)
 *              max_so_far = max_ending_here
 *       return max_so_far
 *
 * Method 2: Dynamic Programming
 *          At every element check if cur_max+a[i] > a[i] , if yes update
 *          check max(cur_sum, max_so_far)
 *          return max_so_far
 */
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3 };
        LargestSumContiguousSubarray dummy = new LargestSumContiguousSubarray();
        System.out.println( dummy.LargestSumWorksForEveryInteger(arr));
    }
    public int largestSumContiguousSubarry(int[] arr){
        int max_sum_so_far = 0;
        int max_ending_here  = 0;
        for(int i = 0; i < arr.length ; i++){
            max_ending_here += arr[i];
            if(max_ending_here < 0 )
                max_ending_here = 0;
            else if(max_sum_so_far < max_ending_here)
                max_sum_so_far = max_ending_here;

        }
        return max_sum_so_far;
    }

    public int LargestSumWorksForEveryInteger(int[] arr){
        int cur_sum = arr[0], max_sum_so_far = arr[0];
        for(int i = 1; i < arr.length; i++){
            cur_sum = Math.max(cur_sum+arr[i], arr[i]);
            max_sum_so_far = Math.max(max_sum_so_far, cur_sum);
        }
        return max_sum_so_far;

    }

}
