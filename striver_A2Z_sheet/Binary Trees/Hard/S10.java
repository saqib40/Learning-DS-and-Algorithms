import java.util.HashMap;
import java.util.Map;
public class S10 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> map) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        // The last element in the postorder range is the root of the current subtree
        TreeNode root = new TreeNode(postorder[postEnd]);

        // Find the index of the root in the inorder traversal
        int inRoot = map.get(root.val);
        // Calculate the number of nodes in the left subtree
        int numsLeft = inRoot - inStart;

        // Recursively build the left subtree
        // - `inStart` to `inRoot - 1` is the range for the left subtree in inorder
        // - `postStart` to `postStart + numsLeft - 1` is the range for the left subtree in postorder
        root.left = buildTree(inorder, inStart, inRoot - 1, postorder, postStart, postStart + numsLeft - 1, map);

        // Recursively build the right subtree
        // - `inRoot + 1` to `inEnd` is the range for the right subtree in inorder
        // - `postStart + numsLeft` to `postEnd - 1` is the range for the right subtree in postorder
        root.right = buildTree(inorder, inRoot + 1, inEnd, postorder, postStart + numsLeft, postEnd - 1, map);

        // Return the constructed subtree rooted at this node
        return root;
    }
}
