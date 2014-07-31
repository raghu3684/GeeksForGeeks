package com.company;

/**
 * Created by ggorantla on 7/31/2014.
 * Source : http://www.geeksforgeeks.org/majority-element/
 * Method 1: check each element and store the count for each element
 *          Time Complexity : O(n*n)
 *          Space Complexity : O(1)
 * Method 2: Use a BST tree to store the counts.
 *          Node Structure : public Node{
 *              int element;
 *              int count;
 *          }
 *          Time Complexity : Self balancing BTree - O(n logn )
 *          Space Complexity : O(n)
 * Method 3: (Efficient)  Moore's Voting Algorithm
 *          Time : O(n)
 *          Space : O(1)
 *          Two Pass algorithm , first pass makes sure the we get some candidate , How?
 *                               if we find the element count++ else count--
 *                               if(count == 0) reset the majority_element
 */
public class MajorityElement {
    public int FindMajority(int[] arr){
        int candidate = getMajority(arr);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(candidate == arr[i])
                count++;
        }
        if(count > arr.length/2)
            return candidate;
        else
            return Integer.MAX_VALUE;
    }
    public int getMajority(int[] arr){
        int majority_element = 0, count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[majority_element] == arr[i])
                count++;
            else
                count--;
            if(count == 0) {
                majority_element = i;
                count = 1;
            }
        }
        return arr[majority_element];
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 1, 3};
        MajorityElement dummy = new MajorityElement();
        System.out.println(dummy.FindMajority(arr));;
    }
}
