package level2_page2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
	
	public int solution(int[][] maps) {
		int answer = 0;
		int maxX=maps.length-1;
		int maxY=maps[0].length-1;
		boolean[][] isVisited = new boolean[maps.length][maps[0].length];
		isVisited[0][0]=true;
		
		Queue<Integer> queue = new LinkedList<>();
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
		
		
		for(int i=0; i<dir.length; i++) {
			int nextX=0+dir[i][0];
			int nextY=0+dir[i][1];
			
			if(nextX>=0 && nextY>=0 && nextX<=maxX && nextY<=maxY) {
				queue.add(nextX);
				queue.add(nextY);
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int x=queue.poll();
			int y=queue.poll();
			int d = queue.poll();
			
			
			switch(d) {
			case 0:
				maps[x][y]=maps[x][y-1]+1;
				break;
			case 1:
				maps[x][y]=maps[x-1][y]+1;
				break;
			case 2:
				maps[x][y]=maps[x][y+1]+1;
				break;
			case 3:
				maps[x][y]=maps[x+1][y]+1;
				break;
				
			}

			if(maxX==x && maxY==y) {
				return maps[x][y];
			}
			for(int i=0; i<dir.length; i++) {
				int nextX=x+dir[i][0];
				int nextY=y+dir[i][1];
				
				if(nextX>=0 && nextY>=0 && nextX<=maxX && nextY<=maxY) {
					queue.add(nextX);
					queue.add(nextY);
					queue.add(i);
				}
			}
		}
		
        return -1;
    }
}