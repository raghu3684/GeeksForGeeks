package com.company;

/**
 * Created by ggorantla on 7/27/2014.
 */
/*
        Consider and example function x^2 - 10*x - 20 .
        Find the first point where the function becomes positive
        Input : Is positive Integers
        Output : Integer when the function is positive for the first time
        Required Time Limit : O(log n)
        Idea :
            1.) O(log n) - gives the idea of Binary Search but we do not have the high value. So get the high value and
            2.) apply BST for high/2 to high

 */
public class FindThePointWhereAFunctionBecomeNegative {
    public static int FindThePointWhereAFunctionBecomeNegative(){
        if(f(0) > 0)
            return 0;
        int i = 1;
        while (f(i) <= 0){
            i *= 2;
        }

        //System.out.println(i);
        return binarySearch(i/2,i);
    }
    public static int binarySearch(int low, int high){

        while(low <= high){
            int mid = low + (high-low)/2;
            // if f(mid) > 0 and mid == low or f(mid-1) <=0 then return mid
            if(f(mid) > 0 &&(f(mid-1) <=0 || low == mid)) return mid;
            if(f(mid) <=0 ) low++;
            else
                high--;
        }
        return low;
    }

    public static int f(int i){
        return ((i*i) - (10*i) -20);
    }

    public static void main(String[] args) {
        System.out.println(FindThePointWhereAFunctionBecomeNegative());
    }
}

