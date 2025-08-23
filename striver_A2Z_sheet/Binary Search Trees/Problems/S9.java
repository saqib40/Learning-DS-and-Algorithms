import java.util.ArrayList;

public class S9 {
    class Node {
        int data;
        Node left, right;
        Node(int x) {
            data = x;
            left = right = null;
        }
    }
    Node pre = null;
    Node succ = null;
    void findPre(Node root, int key) {
        if(root == null) {
            return;
        }
        if(root.data < key) {
            pre = root;
            //root = root.right;
            findPre(root.right,key);
        }
        if(root.data > key) {
            succ = root;
            //root = root.left;
            findPre(root.left,key);
        }
        if(root.data == key) {
            // Finding predecessor (rightmost node of the left subtree)
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre = temp;
            }
            // Finding successor (leftmost node of the right subtree)
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                succ = temp;
            }
        }
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> ans = new ArrayList<>();
        findPre(root,key);
        ans.add(pre);
        ans.add(succ);
        return ans;
    }
}
