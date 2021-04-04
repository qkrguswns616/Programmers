package level1_page2;

public class Clap {
	public String solution(int n) {
	      String answer = "";
	      boolean odd = false;
			int count = 0;
	      if(n%2==1) odd = true;
	      
			while(n>1)
			{
	        
	                answer+="수박";
	           
				n-=2;
			}
			
			if(odd)
			{
				answer+="수";
			}
	      return answer;
	  }
	}