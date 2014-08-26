package LeetCode.BinaryTrees;

import java.util.ArrayList;

/**
 * Created by ggorantla on 8/24/2014.
 */
public class UniqueBinaryTrees {
    public int UBTI(int n){
        int[] count = new int[n+1];
        count[0] = count[1] = 1;
        for (int k = 2; k < n; k++){
            for (int i = 0; i < k; i++){
                count[k] += count[k-1-i] * count[i];

            }
        }
        return count[n];
    }

    public ArrayList<TreeNode> UBTII(int n){
        return helper(1,n);
    }
    public ArrayList<TreeNode> helper(int l, int r){
        ArrayList<TreeNode> trees = new ArrayList<TreeNode>();
        if(l > r){
            trees.add(null);
        }else{
            for(int i = l; i < r; i++){
               ArrayList<TreeNode> lefts = helper(l, i-1);
               ArrayList<TreeNode> rights = helper(i+1, r);
                for(TreeNode left : lefts){
                    for(TreeNode right : rights){
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        trees.add(root);
                    }
                }
            }
        }
        return trees;
    }
}
