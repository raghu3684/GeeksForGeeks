package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Main {
    public static  class pair{
        int a ;
        ArrayList l;
        pair(){
            this.a = Integer.MIN_VALUE;
            this.l = null;
        }
        pair(int xz ){
            this.a = xz;
            this.l = null;
        }
    }
    public static void main(String[] args) {
	// write your code here
        int arr2[] = {1, 10, 5, 2, 7};
        System.out.println(SmallestSubarrayWithSumGreaterThanAGivenArray(arr2,9).a);

    }
    public static pair SmallestSubarrayWithSumGreaterThanAGivenArray(int[] arr, int x){
        pair result = new pair();
        int start = 0,end = 0;
        int curStart = 0, curEnd = 0;
        int curSum = 0,curLength = arr.length+1;
        while (end < arr.length){
            while (curSum <= x && end < arr.length){
                curSum += arr[end++];
            }

            while (curSum > x && start < arr.length){

                if(end-start < curLength){
                    curLength = end -start;
                    curStart = start;
                    curEnd = end;
                }

                curSum -= arr[start++];
            }
        }
        result.a = curLength;

        return result;
    }
}
