package LeetCode.BinaryTrees;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;
/**
 * Created by ggorantla on 8/22/2014.
 */
public class InorderTraversalUsingStack {
    public ArrayList<Integer> traverseInOrder(TreeNode root){
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode curr = root;
        while (curr != null){
            myStack.push(curr);
            curr = curr.left;
        }
        while (!myStack.isEmpty()){
            curr = myStack.pop();
            result.add(curr.val);
            curr = curr.right;
            while (curr != null){
                myStack.push(curr);
                curr = curr.left;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        InorderTraversalUsingStack  traversalObject  = new InorderTraversalUsingStack();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = traversalObject.traverseInOrder(a);


        for (int i = 0 ; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
