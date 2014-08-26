package LeetCode.BinaryTrees;

import java.util.ArrayList;

/**
 * Created by ggorantla on 8/22/2014.
 * This uses Morris Traversal . Which re arranges itself after each step
 *
 */
public class InorderTraversalWithoutStack {
    public ArrayList<Integer> morrisTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode cur = root, pre = null ;

        while (cur != null){
            if(cur.left == null){
                result.add(cur.val);
                cur = cur.right;
            }else{
                pre = cur.left;
                while (pre.right != null && pre.right != cur) pre = pre.right;

                if(pre.right == null){
                    pre.right = cur;
                    cur = cur.left;
                }else{
                    pre.right = null;
                    result.add(cur.val);
                    cur = cur.right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        InorderTraversalWithoutStack obj = new InorderTraversalWithoutStack();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = obj.morrisTraversal(a);


        for (int i = 0 ; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
