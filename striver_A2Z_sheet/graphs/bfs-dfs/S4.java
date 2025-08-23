import java.util.LinkedList;
import java.util.Queue;

public class S4 {
    // two approaches
    // approach 1
    class Solution1 {
    class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    void bfs(int row, int col, int[][] image, int[][] vis, int color, int startColor) {
        //vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        int n = image.length;
        int m = image[0].length;
        q.add(new Pair(row,col));
        while(!q.isEmpty()) {
            int ro = q.peek().row;
            int co = q.peek().col;
            q.remove();
            image[ro][co] = color;
            // top neighbour
            if(ro-1 >= 0 && image[ro-1][co] == startColor && vis[ro-1][co] == 0) {
                q.add(new Pair(ro-1, co));
                //image[ro-1][co] = color;
                vis[ro-1][co] = 1;
            }
            // left nei
            if(co-1 >= 0 && image[ro][co-1] == startColor && vis[ro][co-1] == 0) {
                q.add(new Pair(ro,co-1));
                //image[ro][co-1] = color;
                vis[ro][co-1] = 1;
            }
            // right nei
            if(co+1<m && image[ro][co+1] == startColor && vis[ro][co+1] == 0) {
                q.add(new Pair(ro,co+1));
                //image[ro][co+1] = color;
                vis[ro][co+1] = 1;
            }
            // below nei
            if(ro+1<n && image[ro+1][co] == startColor && vis[ro+1][co] == 0) {
                q.add(new Pair(ro+1,co));
                //image[ro+1][co] = color;
                vis[ro+1][co] = 1;
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] vis = new int[image.length][image[0].length];
        int startColor = image[sr][sc];
        //image[sr][sc] = color;
        bfs(sr,sc,image,vis,color,startColor);
        return image;
    }
}
// approach 2
class Solution2 {
    void dfs(int row, int col, int[][] image, int color, int startColor) {
        int n = image.length;
        int m = image[0].length;
        if (row < 0 || row >= n || col < 0 || col >= m) return;
        if (image[row][col] != startColor) return;

        image[row][col] = color;

        dfs(row - 1, col, image, color, startColor);
        dfs(row + 1, col, image, color, startColor); 
        dfs(row, col - 1, image, color, startColor);
        dfs(row, col + 1, image, color, startColor); 
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor != color) {
            dfs(sr, sc, image, color, startColor);
        }
        return image;
    }
}
}
