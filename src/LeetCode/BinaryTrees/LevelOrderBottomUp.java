package LeetCode.BinaryTrees;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ggorantla on 8/24/2014.
 */
public class LevelOrderBottomUp {
    public ArrayList<ArrayList<Integer>> traverseLevelOrderBottomUp(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        TreeNode curr = root;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(curr);
        que.offer(null);
        while (!que.isEmpty()){
            curr = que.poll();
            ArrayList<Integer> each_layer = new ArrayList<Integer>();
            while(curr != null){
                each_layer.add(curr.val);
                if (curr.left != null) que.offer(curr.left);
                if(curr.right != null) que.offer(curr.right);
                curr = que.poll();
            }
            if (!que.isEmpty()){
                que.offer(null);
            }
            result.add(0,each_layer);
        }
        return result;
    }

    public static void main(String[] args) {
        LevelOrderBottomUp obj = new LevelOrderBottomUp();
        TreeNode a = new TreeNode(1);
        TreeNode b = a.left = new TreeNode(2);
        TreeNode c = a.right = new TreeNode(3);
        System.out.println(obj.traverseLevelOrderBottomUp(a));
    }
}
