package level1_page3;

public class CreatePrimeNumbers {
	 public int solution(int[] nums) {
	        int answer = -1;

	        int[] result = new int[1];
	        
	        choose(nums, 0, 0, 0, result);

	        answer = result[0];
	        return answer;
	    }
	    
	    public void choose(int[] nums, int index, int count, int number, int[] result)
	    {
	    	if(count==3)
	    	{
	    		if(isDecimal(number))
	    			result[0]++;
	    		
	    		return;
	    	}
	    	else if(index==nums.length)
	    		return;
	    	
	    	else if(count<3)
	    	{
	    		choose(nums, index+1, count+1, number+nums[index], result);
	    		choose(nums, index+1, count, number, result);
	    	}
	    }
	    public boolean isDecimal(int number)
	    {
	    	boolean check = true;
	    	
	    	for(int i=2; i<=Math.sqrt(number); i++)
	    	{
	    		if(number%i==0)
	    		{
	    			check = false;
	    			break;
	    		}
	    	}
	    	return check;
	    }
	}
