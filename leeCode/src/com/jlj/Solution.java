package com.jlj;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * 给定一个二叉树，找出其最大深度
 */
public class Solution {

    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root != null){
            getMaxDepth(root, 1);
        }
        return maxDepth;
    }

    private void getMaxDepth(TreeNode root, int deep){
        if (deep > maxDepth){
            maxDepth = deep;
        }
        if(root.left != null){
            getMaxDepth(root.left, deep + 1);
        }
        if(root.right != null){
            getMaxDepth(root.right, deep + 1);
        }
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}


