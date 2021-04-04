package level1_page1;

import java.util.ArrayList;
import java.util.Iterator;

public class PickTwoAndAdd {
	public int[] solution(int[] numbers) {
        int[] answer = {};
     ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
        {
        	for(int j=i+1; j<numbers.length; j++)
        	{
        		int result = sum(numbers[i],numbers[j]);
        		if(!list.contains(result))
        			list.add(result);
        	}
        }
        list.sort(null);
        answer = new int[list.size()];
        
        Iterator iter;
        iter = list.iterator();
        int count=0;
        
        while(iter.hasNext())
        {
        	answer[count] = (int)iter.next();
        	count++;
        }
        
        return answer;
    }
    
    public int sum(int a, int b)
    {
    	return a+b;
    }
}