package level1_page1;

import java.util.ArrayList;

public class FindPrimeNumbers {
	public int solution(int n) {
	      int answer = 1;
	     boolean isPrime = true;
			 boolean[] result = new boolean[n+1];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(2);

				int j=0;
				for(int i=3; i<n+1; i+=2)
				{
					isPrime = true;
					
					if(result[i]) continue;
					
					for(j=0; j<list.size();j++)
					{
						if(list.get(j)>Math.sqrt(i)) break;
						if(i%list.get(j)==0)
							{
							isPrime = false;
							break;
							}
					}
					if(isPrime)
					{
						list.add(i);
						answer++;
						for(int k=i+i; k<=n; k+=i)
						{
							result[k] =true;
						}
				
					}
		        }
	      return answer;
	  }
	}
