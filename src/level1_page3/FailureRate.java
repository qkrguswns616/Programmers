package level1_page3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class FailureRate {
	public int[] solution(int N, int[] stages) {
        int[] answer = {};
       
        
        	int tempTotalCount=0;
		int tempCount = 0;
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		ArrayList<double[]> result = new ArrayList<double[]>();
		double[] temp;
		for(int i=0; i< stages.length; i++)
		{			
			if(hashMap.containsKey(stages[i]))
			{
				hashMap.put(stages[i], hashMap.get(stages[i])+1);
			}
			else
			{
				hashMap.put(stages[i], 1);
			}
		}
		
		for(int i=1; i<N+1; i++)
		{
			if(hashMap.containsKey(i))
			{
				temp=new double[2];
				
				tempCount = hashMap.get(i);
				temp[0] = i;
				temp[1] = ((double)tempCount)/(stages.length-tempTotalCount);
				result.add(temp);
				//System.out.println(i + " - " + ((double)tempCount)/(stages.length-tempTotalCount));
				tempTotalCount+=tempCount;	
			}
			else
			{
				temp = new double[2];
				temp[0] = i;
				temp[1] = ((double)0);
				result.add(temp);
	//			System.out.println(i + " - " + 0);
			}	
		}
		
		result.sort(new Comparator<double[]>() {

			@Override
			public int compare(double[] o1, double[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] != o2[1])
				{
					if(o1[1] > o2[1]) return -1;
					else return 1;
				}
				else
				{
					if(o1[0] > o2[0]) return 1;
					else return -1;
				}
			}
			
		});
		
		answer = new int[N];
		
		for(int i=0; i<result.size(); i++)
		{
			answer[i] = (int)(double)(result.get(i)[0]);
		}
        
        return answer;
    }
}
