package me.yuqiao;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    /**
     * 二叉树的数据结构
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 二叉树中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    /**
     * 递归遍历
     * 时间复杂度
     * 空间复杂度
     * @param root
     * @param res
     */
    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}
