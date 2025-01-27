public class preOrder {
    class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    int index = 0;
    Node constructTree(int n, int pre[], char preLN[]){
	    if(index == n) { // base case; all elements processed
            return null;
        }
        Node root = new Node(pre[index]);
        if(preLN[index] == 'L') { // Check if the node is a leaf or not
            index++;
            return root;
        }
        // If non-leaf, recursively build the tree
        index++;
        root.left = constructTree(n,pre,preLN);
        root.right = constructTree(n,pre,preLN);
        return root;
    }
}
