package level1_page2;

public class NumbersSpacedByX {
	  public long[] solution(int x, int n) {
	      long[] answer = {};
	      
	      answer = new long[n];
			
			answer[0] = x;
			for(int i=1; i<answer.length; i++)
			{
				answer[i] = answer[i-1] + x;
			}
	      return answer;
	  }
	}
