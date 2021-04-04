package level1_page2;

public class PressKeypad {
	  public String solution(int[] numbers, String hand) {
	        String answer = "";
	        
	        int left = 10;
	        int right = 11;
	        
	        for(int i=0; i<numbers.length; i++)
	        {
	        	if(numbers[i]==0)
	        	{
	        		if(getDirection(left,right,numbers[i],hand).equals("right"))
	            	{
	            		answer+="R";
	            		right = numbers[i];
	            	}
	            	else
	            	{
	            		answer+="L";
	            		left = numbers[i];
	            	}
	        	}
	        	else
	        	{
	        		switch(numbers[i]%3)
	            	{
		            	case 1:
		            		answer+="L";
		            		left = numbers[i];
		            		break;
		            	case 2:
		            		if(getDirection(left,right,numbers[i],hand).equals("right"))
		                	{
		                		answer+="R";
		                		right = numbers[i];
		                	}
		                	else
		                	{
		                		answer+="L";
		                		left = numbers[i];
		                	}
		            		break;
		            	case 0: 
		            		answer+="R";
		            		right = numbers[i];
		            		break;
	            		
	            	}	
	        	}
	        	
	        	
	        }

	        return answer;
	    }
	    
	    public String getDirection(int left,int right, int number, String hand)
	    {
	    	int leftDistance = getLeftDistance(left, number);
	    	int rightDistance = getRightDistance(right, number);
	    	
	    	String direction = "";

	    	if(leftDistance<rightDistance)
	    		direction="left";
	    	else if(leftDistance>rightDistance)
	    		direction = "right";
	    	else
	    		direction = hand;
	    	
	    	return direction;
	    }
	    
	    public int getLeftDistance(int left, int number)
	    {
	    	if(left==10)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 4;
		    		case 5: return 3;
		    		case 8: return 2;
		    		case 0: return 1;
	    		}
	    	}
	    	else if(left==1)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 1;
		    		case 5: return 2;
		    		case 8: return 3;
		    		case 0: return 4;
	    		}
	    	}
	    	else if(left==4)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 2;
		    		case 5: return 1;
		    		case 8: return 2;
		    		case 0: return 3;
	    		}
	    	}
	    	else if(left==7)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 3;
		    		case 5: return 2;
		    		case 8: return 1;
		    		case 0: return 2;
	    		}
	    	}
	    	else if(left==2)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 0;
		    		case 5: return 1;
		    		case 8: return 2;
		    		case 0: return 3;
	    		}
	    	}
	    	else if(left == 5)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 1;
		    		case 5: return 0;
		    		case 8: return 1;
		    		case 0: return 2;
	    		}
	    	}
	    	else if(left==8)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 2;
		    		case 5: return 1;
		    		case 8: return 0;
		    		case 0: return 1;
	    		}
	    	}
	    	else if(left==0)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 3;
		    		case 5: return 2;
		    		case 8: return 1;
		    		case 0: return 0;
	    		}
	    	}

	    	return -1;
	    }
	    public int getRightDistance(int right, int number)
	    {
	    	if(right==11)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 4;
		    		case 5: return 3;
		    		case 8: return 2;
		    		case 0: return 1;
	    		}
	    	}
	    	else if(right==3)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 1;
		    		case 5: return 2;
		    		case 8: return 3;
		    		case 0: return 4;
	    		}
	    	}
	    	else if(right==6)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 2;
		    		case 5: return 1;
		    		case 8: return 2;
		    		case 0: return 3;
	    		}
	    	}
	    	else if(right==9)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 3;
		    		case 5: return 2;
		    		case 8: return 1;
		    		case 0: return 2;
	    		}
	    	}
	    	else if(right==2)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 0;
		    		case 5: return 1;
		    		case 8: return 2;
		    		case 0: return 3;
	    		}
	    	}
	    	else if(right == 5)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 1;
		    		case 5: return 0;
		    		case 8: return 1;
		    		case 0: return 2;
	    		}
	    	}
	    	else if(right==8)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 2;
		    		case 5: return 1;
		    		case 8: return 0;
		    		case 0: return 1;
	    		}
	    	}
	    	else if(right==0)
	    	{
	    		switch(number)
	    		{
		    		case 2: return 3;
		    		case 5: return 2;
		    		case 8: return 1;
		    		case 0: return 0;
	    		}
	    	}

	    	return -1;
	    }
	}
