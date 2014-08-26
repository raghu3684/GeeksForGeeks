package LeetCode.BinaryTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ggorantla on 8/24/2014.
 */

public class LevelOrderZigZag {
    public ArrayList<ArrayList<Integer>> traverseZigZag(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        TreeNode cur = root;
        int level = 0;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(cur);
        que.offer(null);
        while (!que.isEmpty()){
            cur = que.poll();
            ArrayList<Integer> each_layer = new ArrayList<Integer>();
            while (cur != null){
                if(level %2 == 0)
                    each_layer.add(cur.val);
                else
                    each_layer.add(0,cur.val);
                if (cur.left != null) que.offer(cur.left);
                if (cur.right != null) que.offer(cur.right);
                cur = que.poll();
            }
            if(!que.isEmpty())
                {
                    que.offer(null);
                    level++;
                }
            result.add(each_layer);

        }
        return result;
    }

    public static void main(String[] args) {
        LevelOrderZigZag obj = new LevelOrderZigZag();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        System.out.println(obj.traverseZigZag(a));
    }
}
