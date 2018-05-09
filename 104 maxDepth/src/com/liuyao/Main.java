package com.liuyao;


import java.util.LinkedList;

/**
 * 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

 说明: 叶子节点是指没有子节点的节点。

 示例：
 给定二叉树 [3,9,20,null,null,15,7]，

 3
 / \
 9  20
 /  \
 15   7
 返回它的最大深度 3 。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root==null){
                return 0;
            }
           return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }

        public int maxDepth2(TreeNode root){
            if (root==null){
                return 0;
            }
            LinkedList<TreeNode> queue=new LinkedList<>();
            queue.addLast(root);
            int depth=0;
            while (!queue.isEmpty()){
                depth++;
                int size=queue.size();
                while (size-->0){
                    TreeNode temp=queue.removeFirst();
                    if (temp.left!=null){
                        queue.addLast(temp.left);
                    }
                    if (temp.right!=null){
                        queue.addLast(temp.right);
                    }
                }
            }
            return depth;
        }
    }
}