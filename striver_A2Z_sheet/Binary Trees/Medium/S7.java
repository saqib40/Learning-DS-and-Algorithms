import java.util.ArrayList;
import java.util.List;

public class S7 {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
   
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isLeaf(TreeNode node) {
        if(node.left == null && node.right == null) {
            return true;
        } else {
            return false;
        }
    }
    public static void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.left;
        while(curr != null) {
            if(isLeaf(curr)==false) res.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    public static void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if(isLeaf(root) == true) {
            res.add(root.data);
            return;
        }
        if(root.left!=null) addLeaves(root.left,res);
        if(root.right!=null) addLeaves(root.right,res);
    }
    public static void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr != null) {
            if(!isLeaf(curr)) temp.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i=temp.size()-1; i>=0; i--) {
            res.add(temp.get(i));
        }
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        if (!isLeaf(root)) ans.add(root.data);
        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);
        return ans;
    }
}
