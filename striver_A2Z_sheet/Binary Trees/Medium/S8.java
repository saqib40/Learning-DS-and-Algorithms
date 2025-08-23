// NOTE
// VERY VERY HARD

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class S8 {
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
    class Tuple {
        TreeNode node;
        int row;
        int col;
        Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // first integer => vertical distance : This correctly groups nodes by their vertical alignment.
        // second integer => level : : For each vertical line (row), this inner TreeMap stores PriorityQueues. The key of this inner map is the level of the nodes. By iterating through the entries of this inner TreeMap (which are naturally sorted by level due to TreeMap), you process nodes at shallower levels before deeper levels for the same vertical line.
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row; // vertical
            int y = tuple.col; // level
            if(!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.data);
            if(node.left != null) {
                q.offer(new Tuple(node.left, x-1, y+1));
            }
            if(node.right != null) {
                q.offer(new Tuple(node.right, x+1, y+1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> temp = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : ys.values()) {
                while(!nodes.isEmpty()) {
                    temp.add(nodes.poll());
                }
            }
            list.add(temp);
        }
        return list;
    }
}

/*
 * The outer TreeMap correctly groups nodes that fall on the same vertical line (same row value). This is the primary organization.
 * For each vertical level (each entry in the outer TreeMap), the inner TreeMap comes into play. The key of this inner TreeMap is the col value, which represents the depth or level of the node in the tree. So, for a single vertical line, nodes at different depths are stored in different PriorityQueues within this inner TreeMap.
 * The PriorityQueue associated with a specific vertical level (row) and a specific depth (col) stores the data of all nodes found at that exact vertical position and depth. 
 * Retrieval
 * We first iterate through the outer TreeMap (map.values()), which gives us the inner TreeMaps for each vertical level (sorted by row).
 * Crucially, for each vertical level, we then iterate through the values of the inner TreeMap (ys.values()). Because the inner TreeMap is keyed by col (the depth), its values (which are the PriorityQueues) are retrieved in the order of increasing depth (top to bottom).
 * For each of these PriorityQueues (representing a specific depth within a vertical level), we extract the sorted node values using nodes.poll() and add them to the temp list.
 */