package level1_page2;

public class ConvertStringToInteger {
	public int solution(String s) {
	      int answer = 0;
	      
	      switch(s.charAt(0))
	      {
	          case '+':
	              answer = Integer.parseInt(s.substring(1,s.length()));
	              break;
	          case '-':
	              answer-= Integer.parseInt(s.substring(1,s.length()));
	              break;
	          default:
	              answer = Integer.parseInt(s);
	              break;
	      }
	      
	      return answer;
	  }
	}