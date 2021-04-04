package level1_page3;

import java.util.ArrayList;

public class DartsGame {
	 public int solution(String dartResult) {
	      int answer = 0;
	      
	      	int tempResult = 0;
			
			ArrayList<Integer> result = new ArrayList<Integer>();
			
			for(int i=0; i<dartResult.length(); i++)
			{
				try
				{
					Integer.parseInt(Character.toString(dartResult.charAt(i)));
					result.add(tempResult);
					tempResult = Character.getNumericValue(dartResult.charAt(i));
	                if( i!=dartResult.length()-1&&Character.getNumericValue(dartResult.charAt(i+1))==0)
					{
						tempResult = 10;
						i++;
					}
				}
				catch(NumberFormatException e)
				{
					switch(dartResult.charAt(i))
					{
						case 'D':
							tempResult=(int) Math.pow(tempResult, 2);
							
							break;
						case 'T':
							tempResult=(int) Math.pow(tempResult, 3);
							break;
						case '*':
							tempResult*=2;
							result.set(result.size()-1,result.get(result.size()-1)*2);
							break;
						case '#':

							tempResult*=-1;
						
							break;
						default : 
							break;
					}
				}
			}
			result.add(tempResult);
			

			for(int i=0; i<result.size(); i++)
			{
				answer+=result.get(i);
			}
	      return answer;
	  }
	}
