package LeetCode.BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ggorantla on 8/22/2014.
 */
public class PreorderTraversalUsingStack {
    public ArrayList<Integer> traversePreOrder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode curr = root;

        while (curr != null){
            myStack.push(curr);
            result.add(curr.val);
            curr = curr.left;
        }

        while (!myStack.isEmpty()){
            curr = myStack.pop();
            curr = curr.right;
            while (curr != null){
                myStack.push(curr);
                result.add(curr.val);
                curr = curr.left;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        PreorderTraversalUsingStack  traversalObject  = new PreorderTraversalUsingStack();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = traversalObject.traversePreOrder(a);


        for (int i = 0 ; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
