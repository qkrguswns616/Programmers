package level1_page2;

public class RemoveSmallestNumber {
	public int[] solution(int[] arr) {
	      int[] answer = {};
	      
	      	int min = arr[0];
			int index = 0;
			
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]<min)
				{
					index = i;
					min = arr[i];
				}
			}
			
			int count = 0;
			if(arr.length==1)
			{
				answer = new int[1];
				answer[0] = -1;
			}
			else
			{
				answer = new int[arr.length-1];
				for(int i=0; i<arr.length; i++)
				{
					if(i==index) continue;
					answer[count] = arr[i];
					count++;
				}
			}
	      
	      return answer;
	  }
	}
