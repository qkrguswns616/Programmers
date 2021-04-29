package level2_page1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KakaoColoringBook {
	 public int[] solution(int m, int n, int[][] picture) {
	        
	        
	        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
	        ArrayList<Color> list = new ArrayList<>();
	        Queue<Integer> queue = new LinkedList<>();
	        
	        int[][] tempPicture = new int[m][n];
	        for(int i=0; i<m; i++) {
	        	for(int j=0; j<n; j++) {
	        		tempPicture[i][j] = picture[i][j];
	        	}
	        }
	        
	        for(int i=0; i<m; i++) {
	        	
	        	for(int j=0; j<n; j++) {
	        		int num = tempPicture[i][j];
	        		int count=0;
	        		
	        		if(num!=0) {
	        			tempPicture[i][j]=0;
	        			queue.add(i);
	        			queue.add(j);
	        			
	        			while(!queue.isEmpty()) {
	        				int x = queue.poll();
	        				int y = queue.poll();

	        				count++;
	        				
	        				for(int k=0; k<4; k++) {
	        					int nextX = x+dir[k][0];
	        					int nextY = y+dir[k][1];
	        					
	        					if(nextX>=0 && nextX<m && nextY>=0 && nextY < n) {
	        						
	        						if(tempPicture[nextX][nextY]==num) {
	        							tempPicture[nextX][nextY]=0;
	        							queue.add(nextX);
	        							queue.add(nextY);
	        						}
	        					}
	        				}
	        				
	        				
	        			}
	        			list.add(new Color(num,count));
	        		}
	        	}
	        }
	        
//	        for(Color key:list) {
//	        	System.out.println("key : " + key.num + " -> " + key.count);
//	        }
	        
	        int[] answer = new int[2];
	        answer[0] = list.size();
	        
	        for(int i=0; i<list.size(); i++) {
	        	answer[1]  = Math.max(answer[1], list.get(i).count);
	        }
	        
//	        System.out.println("RESULT  : " + answer[0] +" " + answer[1]);
	        return answer;
	    }
}

class Color {
	int num=0;
	int count=0;
	
	public Color(int num, int count) {
		this.num = num;
		this.count = count;
	}
}
