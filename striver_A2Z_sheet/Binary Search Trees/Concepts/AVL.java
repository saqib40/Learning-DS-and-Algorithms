public class AVL {
    static class Node {
        int value;
        Node left;
        Node right;
        int height;
        Node(int value) {
            this.value = value;
        }
    }
    static int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }
    static Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        // modify links
        c.right = p;
        p.left = t;
        // update heights
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return c;
    }
    static Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return p;
    }
    static Node rotate(Node node) {
        // left heavy case
        if((height(node.left)-height(node.right)) > 1) {
            // left-left case
            if((height(node.left.left)-height(node.left.right)) > 0) {
                return rightRotate(node);
            }
            // left-right case
            if((height(node.left.left)-height(node.left.right)) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        // right heavy case
        if((height(node.right)-height(node.left)) > 1) {
            // right-right case
            if ((height(node.right.right)-height(node.right.left)) > 0) {
                return leftRotate(node);
            }
            // right-left case
            if ((height(node.right.right)-height(node.right.left)) < 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    static Node insert(Node root, int value) {
        if(root==null) {
            root = new Node(value);
            return root;
        }
        if(value<=root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right,value);
        }
        root.height = Math.max(height(root.left),height(root.right))+1;
        return rotate(root); // rotation happens only for one node cause that's the only one which satidfies the conditions for it
    }
    public static void main(String[] args) {
        Node root = null;
        for(int i=0; i<1000; i++) {
            root = insert(root,i);
        }
        System.out.println(height(root));
    }
}
