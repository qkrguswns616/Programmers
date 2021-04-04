package level1_page2;

public class DivisorAndMultiple {
	public int[] solution(int n, int m) {
	      int[] answer = {};
	      
				long min=1;
			long max=0;
			answer = new int[2];
			
			if(n>m)
			{
				int temp = n;
				n = m;
				m = temp;
			}
			
			for(int i=1; i<=n; i++)
			{
				if(m%i==0 && n%i==0) min=i;
			}
			
			max = (n/min)*m;
			answer[0] = (int)min;
			answer[1] = (int)max;
	      return answer;
	  }
	}