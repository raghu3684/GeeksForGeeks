package LeetCode.BinaryTrees;

import sun.reflect.generics.tree.Tree;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ggorantla on 8/24/2014.
 */
public class LevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> traverseLevelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        TreeNode cur = root;
        que.offer(cur);
        que.offer(null);
        while (!que.isEmpty()){
            cur = que.poll();
            ArrayList<Integer> each_layer = new ArrayList<Integer>();
            while (cur != null) {
                each_layer.add(cur.val);
                if (cur.left != null) que.offer(cur.left);
                if (cur.right != null) que.offer(cur.right);
                cur = que.poll();
            }
            result.add(each_layer);
            if (!que.isEmpty()) que.offer(null);
         }
        return result;
    }

    public static void main(String[] args) {
        LevelOrderTraversal obj = new LevelOrderTraversal();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        temp = obj.traverseLevelOrder(a);
        System.out.println(temp);

        for (int i = 0 ; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
}
