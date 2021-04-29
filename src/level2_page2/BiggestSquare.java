package level2_page2;

public class BiggestSquare {
	public int solution(int [][]board)
    {
		int answer = 1;
		int weight = board.length;
		int height = board[0].length;
		
		int max=0;
		int[][] map = new int[weight+1][height+1];
		
		for(int i=0; i<weight; i++) {
			for(int j=0; j<height; j++) {
				map[i+1][j+1] = board[i][j];
			}
		}
		
		int[][] dir = {{0,-1},{-1,0},{-1,-1}};
		for(int i=1; i<weight+1; i++) {
			for(int j=1; j<height+1; j++) {
				int min = Integer.MAX_VALUE;
				
				if(map[i][j]!=0) {

					for(int k=0; k<3; k++) {
						min = Math.min(min,map[i+dir[k][0]][j+dir[k][1]]);
					}
					
					map[i][j] = min+1;
					max= Math.max(map[i][j], max);	
				}
				
			}
		}
		
		answer = max*max;
		System.out.println(answer);
		
        return answer;
    }
}
