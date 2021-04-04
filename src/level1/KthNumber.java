package level1;

import java.util.Arrays;

public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
       
		int start, end,index;
		int[] tempArray;
		
		answer = new int[commands.length];
		for(int i=0; i<commands.length; i++)
		{
			start = commands[i][0];
			end = commands[i][1];
			index = commands[i][2];
	            
	        tempArray = new int[end-start+1];
	        
	        for(int j=0; j<end-start+1; j++)
	        {
	        	tempArray[j] = array[start+j-1];
	        }
	        Arrays.sort(tempArray);
			
		
			answer[i] = tempArray[index-1];
		}
        
        
        return answer;
    }
}