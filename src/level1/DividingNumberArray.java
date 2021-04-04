package level1;

import java.util.Arrays;

public class DividingNumberArray {
	public int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      
	      	int[] answer2 = {};
		      
			int count = 0;
			answer = new int[arr.length];
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]%divisor==0)
				{
					answer[count] = arr[i];
					count++;
				}
			}	

			
			if(count==0) 
			{
				answer2 = new int[1];
				answer2[0] = -1;
			}
			else
			{

				answer2 = new int[count];
				for(int i=0; i<count; i++)
				{
					answer2[i] = answer[i];
				}
				Arrays.sort(answer2);
			}
			
	      
	      return answer2;
	  }
	}