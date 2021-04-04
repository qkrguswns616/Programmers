package level1_page1;

import java.util.ArrayList;

public class IHateSameNumber {
	public int[] solution(int []arr) {
        int[] answer = {};
        int temp = -1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(temp!=arr[i]) 
            {
                result.add(arr[i]);
                temp = arr[i];
            }
        }
        
        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++)
        {
            answer[i] = result.get(i);
        }
        
        return answer;
	}
}