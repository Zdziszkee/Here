package me.zdziszkee.binarytree;

public class TreeUtil {
    public static int treeDepth(TreeNode root) {
        return path(root);
    }

    private static int path(TreeNode node) {
        if (node == null) return 0;
        return Math.max(path(node.left) + 1, path(node.right) + 1);
    }
}
