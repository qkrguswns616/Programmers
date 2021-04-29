package level2_page2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
	public int solution(int[][] maps) {
		
        int answer = 0;
        int row = maps.length;
        int col = maps[0].length;
        int [][] visited = new int[row][col];
       
        
        Point start = new Point(0,0);
        return bfs(start,maps,visited,row,col);
        
	}
    
    public int bfs(Point start,int [][] maps, int [][] visited,int row, int col) {
    
        int [] dx = {0,0,-1,1};
        int [] dy = {1,-1,0,0};
        Queue<Point> q = new LinkedList<>();
        
        
        q.add(start);
        visited[start.x][start.y] = 1;
        
        while(!q.isEmpty()) {
            Point cur = q.poll();
            for(int i = 0; i < 4; i++) {
               int nextX = cur.x + dx[i];
               int nextY = cur.y + dy[i];
               
               if(nextX <0 || nextY <0 || nextX >= row|| nextY >= col) continue;
               if(visited[nextX][nextY] > 0 || maps[nextX][nextY] == 0) continue;
               
               q.add(new Point(nextX,nextY));
               visited[nextX][nextY] = visited[cur.x][cur.y] + 1;
            }
        }
        
        return visited[row-1][col-1] == 0 ? -1 : visited[row-1][col-1];
        
    }
}
class Point{
    
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
}