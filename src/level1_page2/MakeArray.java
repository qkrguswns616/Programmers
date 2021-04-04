package level1_page2;

public class MakeArray {
	  public int[] solution(long n) {
	      int[] answer = {};
	      
	      
			String tempString = Long.toString(n);
			answer = new int[tempString.length()];
			
	      
	      for(int i=0; i<tempString.length();i++)
			{
				answer[i] = Character.getNumericValue(tempString.charAt(tempString.length()-i-1));
	      }
	      return answer;
	  }
	}