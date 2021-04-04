package level1_page1;

public class HandlingPackages {
	public boolean solution(String s) {
	      boolean answer = true;
	      
	      if(s.length()!=4 && s.length()!=6)
	      {
	          answer = false;
	          return answer;
	      }
	      else
			{
				for(int i=0; i<s.length();i++)
				{
					if(Character.getNumericValue(s.charAt(i))>9 || Character.getNumericValue(s.charAt(i)) <0)
	                {
	                    answer = false;
	                    return answer;
	                }
				}
			}
	      
	      return answer;
	  }
	}