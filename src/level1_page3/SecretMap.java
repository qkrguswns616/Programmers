package level1_page3;

public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = {};
	   
	      	int tempNum;
			int tempNum2;
			boolean flag = true;
			
			answer = new String[n];
			int count;
			
			for(int i=0; i<arr1.length; i++)
			{
				tempNum = arr1[i];
				tempNum2 = arr2[i];
				answer[i] = "";
				flag = true;
				count = n;
				while(flag)
				{
					if(tempNum%2 ==1) answer[i] = "#".concat(answer[i]);
					else 
					{
						if(tempNum2%2==1) answer[i] ="#".concat(answer[i]);
						else answer[i] = " ".concat(answer[i]);
					}
					
	                count--;
					if(count==0) break;
					if(tempNum==0 && tempNum2==0) 
					{
						while(count!=0)
						{
							answer[i] = " ".concat(answer[i]);
							count--;
						}
						break;
					}
	                
					
					
					
					tempNum/=2;
					tempNum2/=2;
					
				}
			}
	      
	      return answer;
	  }
	}
