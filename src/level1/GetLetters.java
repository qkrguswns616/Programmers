package level1;

public class GetLetters {
	 public String solution(String s) {
	      String answer = "";
	      if(s.length()%2==0)
	      {
	          answer = Character.toString(s.charAt(s.length()/2-1)) + Character.toString(s.charAt(s.length()/2));
	      }
	      else
	      {
	          answer = Character.toString(s.charAt(s.length()/2));
	      }
	      System.out.println(s.length());
	      return answer;
	  }
	}