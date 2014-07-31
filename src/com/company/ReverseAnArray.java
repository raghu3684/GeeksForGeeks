package com.company;

/**
 * Created by ggorantla on 7/30/2014.
 */
public class ReverseAnArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6 };
        ReverseAnArray dummy = new ReverseAnArray();
        dummy.reverseAnArrayRecursive(arr);
        print(arr);
        System.out.println();
        dummy.reverseAnArrayIterative(arr);
        print(arr);
    }
    public void reverseAnArrayIterative(int[] arr){
        helperIterative(arr, 0, arr.length-1);
    }
    public void reverseAnArrayRecursive(int[] arr){
        helperRecursive(arr, 0, arr.length-1);
    }
    protected void helperRecursive(int[] arr, int start, int end){
        System.out.println("start:->"+ start +"   End: -> "+ end);
        if(start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        helperRecursive(arr, start+1, end-1);
        /*
            incase if I use : helperRecursive(arr, start++, end--);   This will give a STACKOVERFLOWERROR
            Reason: This is because of the post increment operator start++ and end--. They are not incremented as we have not reached ";" yet
            start:->0   End: -> 5
            start:->0   End: -> 5
            start:->0   End: -> 5
            start:->0   End: -> 5

            Solution : use start+1, end-1                    or Pre increment operator --start, --end
                     helperRecursive(arr, start+1, end-1);       helperRecursive(arr, ++start, --end);
            start:->0   End: -> 5
            start:->1   End: -> 4
            start:->2   End: -> 3
            start:->3   End: -> 2

            website : http://stackoverflow.com/questions/214741/what-is-a-stack-overflow-error
         */
    }

    protected void helperIterative(int[] arr, int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++)
            System.out.print(" " + arr[i] + " ");
    }
}
