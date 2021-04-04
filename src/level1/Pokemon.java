package level1;

import java.util.HashMap;

public class Pokemon {
	 public int solution(int[] nums) {
	        int answer = 0;
	        
	         int n = nums.length/2;
	        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0; i<nums.length; i++)
	        {
	        	if(!map.containsKey(nums[i]))
	        		map.put(nums[i], 1);
	        }
	        
	        answer = map.size();
	        if(answer>n) answer = n;
	        return answer;
	    }
	}
