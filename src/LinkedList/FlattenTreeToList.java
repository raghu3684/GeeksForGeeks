package LinkedList;

 import LeetCode.BinaryTrees.TreeNode;



/**
 * Created by ggorantla on 8/25/2014.
 */
public class FlattenTreeToList {
    public void flatten(TreeNode root){
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                if (cur.right != null) {
                    TreeNode next = cur.left;
                    while (next.right != null) next = next.right;
                    next.right = cur.right;
                }
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
