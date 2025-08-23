import java.util.LinkedList;
import java.util.Queue;

public class S2 {
    class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    void bfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()) {
            int ro = q.peek().row;
            int co = q.peek().col;
            q.remove();
            for(int delR = -1; delR <= 1; delR++) {
                for(int delC = -1; delC <= 1; delC++) {
                    int nRow = ro+delR;
                    int nCol = co+delC;
                    if(nRow >= 0 && nRow < n && nCol >=0 && nCol < m && grid[nRow][nCol]=='L' && vis[nRow][nCol]==0) {
                        vis[nRow][nCol] = 1;
                        q.add(new Pair(nRow,nCol));
                    }
                }
            }
        }
    }
    public int countIslands(char[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int count = 0;
        for(int row=0; row<grid.length; row++) {
            for(int col=0; col<grid[0].length; col++) {
                if (vis[row][col] == 0 && grid[row][col] == 'L') {
                    bfs(row,col,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
}
