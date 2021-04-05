package level2_page1;

public class TriangularSnail {
	  public int[] solution(int n) {
	        int[] answer = {};
	        int len = (n+1)*n/2;
	        answer = new int[len];
	        int[][] map = new int[n][n];
	        
	        int dir = 0;
	        int num=1;
	        int x=-1;
	        int y=0;
	        for(int i=n; i>0; i--) {
	        	for(int j=0; j<i; j++) {
	        		switch(dir%3) {
	        		case 0:
	        			//down
	        			x++;
	        			map[x][y] = num;
	        			
	        			break;
	        		case 1:
	        			y++;
	        			map[x][y] = num;
	        			
	        			//right
	        			break;
	        		case 2:
	        			x--;
	        			y--;
	        			map[x][y] = num;
	        			
	        			//up
	        			break;
	        		}
	        		num++;
	        	}
	        	dir++;
	        }
	        int index=0;
	        for(int i=0; i<map.length; i++) {
	        	for(int j=0; j<map.length; j++) {
	        		if(map[i][j]!=0) {
	        			answer[index] = map[i][j];
	        			index++;
	        		}
	        	}
	        	
	        }
	        
	     
	        return answer;
	  }
}