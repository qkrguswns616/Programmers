package level1_page2;

public class ColaChiChu {
	 public int solution(int num) {
	     long num2 = num;
			int answer = 0;
		
	      if(num2 ==1) return 0;
			for(int i=0; i<500; i++)
			{
				if(num2%2==0)
				{
					num2/=2;
				}
				else
				{
					num2 = (num2*3)+1;
				}
				answer++;
				if(num2==1) break;
			}
			
			if(num2!=1) answer = -1;
	      
			 System.out.println(answer);
	      return answer;
	  }
	}