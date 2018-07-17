package com.liuyao;

/**
 * 给定一个二叉树，它的每个结点都存放着一个整数值。

 找出路径和等于给定数值的路径总数。

 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。

 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。

 示例：

 root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

 10
 /  \
 5   -3
 / \    \
 3   2   11
 / \   \
 3  -2   1

 返回 3。和等于 8 的路径有:

 1.  5 -> 3
 2.  5 -> 2 -> 1
 3.  -3 -> 11
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    class Solution {
        public int pathSum(TreeNode root, int sum) {
            if (root==null){
                return 0;
            }
//            包含这个节点，和为sum的个数
            int res=findPath(root,sum);
//            不包含这个几点，和为sum的个数
            res+=pathSum(root.left,sum);
            res+=pathSum(root.right,sum);
            return res;
        }

        public int findPath (TreeNode node,int sum){
            if (node==null){
                return 0;
            }
            int res=0;
//            找到了一条
            if (node.val==sum){
                res+=1;
            }
            res+=findPath(node.left,sum-node.val);
            res+=findPath(node.right,sum-node.val);
            return res;
        }
    }
}
