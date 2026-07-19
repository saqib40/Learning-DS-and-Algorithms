package tries.theory;

public class Trie {
    static class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }

    Node root;

    public Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        Node curr = this.root;
        for(char ch : word.toCharArray()) {
            int ind = ch-'a';
            if(curr.children[ind] == null) {
                curr.children[ind] = new Node();
            }
            curr = curr.children[ind];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        Node curr = this.root;
        for(char ch:word.toCharArray()) {
            int ind = ch-'a';
            if(curr.children[ind] == null) {
                return false;
            }
            curr = curr.children[ind];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = this.root;
        for(char ch:prefix.toCharArray()) {
            int ind = ch-'a';
            if(curr.children[ind] == null) {
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }
}
