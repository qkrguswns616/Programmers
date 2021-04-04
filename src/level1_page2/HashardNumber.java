package level1_page2;

public class HashardNumber {
	 public boolean solution(int x) {
	      boolean answer = true;
	      
	      String tempString = Integer.toString(x);
	      int total = 0;
			for(int i=0; i<tempString.length();i++)
			{
			//	arr[i] = Character.toString(tempString.charAt(i));
				total += Character.getNumericValue(tempString.charAt(i));
			}
			
			if(x%total!=0) answer = false; 
	      
	      return answer;
	  }
	}
