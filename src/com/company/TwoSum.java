package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ggorantla on 7/31/2014.
 * Source : http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 * Method 1: Sort and do search from left and right (similar to binary search)
 * Method 2: HashMap
 */
public class TwoSum {
    public ArrayList<TwoSumNode> twoSum(int[] arr, int sum){
        ArrayList<TwoSumNode> result = new ArrayList<TwoSumNode>();
        HashMap<Integer, Integer> myMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < arr.length; i++){
            int other = sum - arr[i];
            if(myMap.get(other) != null){
                TwoSumNode temp = new TwoSumNode(i+1, myMap.get(other)+1);
                result.add(temp);
            }
            myMap.put(arr[i], i);

        }
        return result;
    }
    public class TwoSumNode{
        int first;
        int second;
        TwoSumNode(int a, int b){
            this.first = a;
            this.second = b;
        }
    }

    public static void main(String[] args) {
        TwoSum dummy = new TwoSum();
        int[] arr = {4, 4, 45, 6, 10, 7,1};
        int[] arr1= {1, -8, 12};
        ArrayList<TwoSumNode> res =  dummy.twoSum(arr1, 4);
        for(TwoSumNode l : res)
            System.out.println(l.first + " " +l.second);
    }
}
