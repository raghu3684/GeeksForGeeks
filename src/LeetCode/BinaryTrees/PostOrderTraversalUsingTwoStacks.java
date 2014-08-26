package LeetCode.BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ggorantla on 8/22/2014.
 */
public class PostOrderTraversalUsingTwoStacks {
    public ArrayList<Integer> traversePostOrder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stackback = new Stack<TreeNode>();
        Stack<Integer> mystack = new Stack<Integer>();

        TreeNode curr = root;
        while (curr !=null){
            stackback.push(curr);
            mystack.push(curr.val);
            curr = curr.right;
        }

        while (!stackback.isEmpty()){
            curr = stackback.pop();
            curr = curr.left;
            while (curr != null){
                stackback.push(curr);
                mystack.push(curr.val);
                curr = curr.right;
            }
        }

        while (!mystack.isEmpty()){
            result.add(mystack.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        PostOrderTraversalUsingTwoStacks  traversalObject  = new PostOrderTraversalUsingTwoStacks();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = traversalObject.traversePostOrder(a);


        for (int i = 0 ; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
