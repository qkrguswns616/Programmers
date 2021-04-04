package level1_page2;

public class WeirdCharacters {
	public String solution(String s) {
	      String answer = "";
	       int totalLength = 0;
			 int length = 0;
			 
			 totalLength = s.length();
			String[] splitString; 
			 
			splitString = s.split(" ");

			for(int i=0; i<splitString.length; i++)
			{
				for(int j=0; j<splitString[i].length(); j++)
				{
					if(j%2==0)
					{
						if(splitString[i].charAt(j)>=97 && splitString[i].charAt(j)<=122)
						{
							answer += Character.toUpperCase(splitString[i].charAt(j));
						}
						else
						{
							answer += splitString[i].charAt(j);
						}
					}
					else
					{
						if(splitString[i].charAt(j)<=90 && splitString[i].charAt(j)>=65)
						{
							answer += Character.toLowerCase(splitString[i].charAt(j));
						}
						else
						{
							answer += splitString[i].charAt(j);
						}
					}
					
					
				}
				if(i!=splitString.length-1)
				{
					answer += " ";
				}
			}
			
			length = answer.length();
			for(int i = length; i<totalLength; i++)
			{
				answer += " ";
			}
	      return answer;
	  }
	}
