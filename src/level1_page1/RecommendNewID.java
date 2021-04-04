package level1_page1;

public class RecommendNewID {
	 public String solution(String new_id) {
	        String answer = new_id;
	         
	     
	         answer = answer.toLowerCase();
	 //Step 2

	        for(int i=0; i<answer.length()-1; i++) {
	        	int temp = answer.charAt(i);
	        	
	        	if(temp==45 || temp==46 || (temp >47 && temp<58) || (temp>64 && temp <91) || temp==95 || (temp>96 && temp<123)) {
	        		
	        	}else {
	        		answer = answer.substring(0,i)+answer.substring(i+1,answer.length());
	        		i--;
	        	}
	        }
	        
	        int temp = answer.charAt(answer.length()-1);
	    	if(temp==45 || temp==46 || (temp >47 && temp<58) || (temp>64 && temp <91) || temp==95 || (temp>96 && temp<123)) {
	    		
	    	}else {
	    		answer = answer.substring(0,answer.length()-1);
	    	}
	        
	        

	        //Step 3
	        answer.replace("..", ".");
	        
	        for(int i=0; i<answer.length()-1; i++) {
	        	if(answer.charAt(i)=='.' && answer.charAt(i+1)=='.') {
	        		answer = answer.substring(0,i)+answer.substring(i+1,answer.length());
	        		i--;
	        	}
	        }

	        
	        //Step 4
	        if(answer.charAt(0)=='.') {
	        	if(answer.length()==1) {
	        		answer="a";
	        	}else {
	        		answer = answer.substring(1, answer.length());	
	        	}
	        }
	        
	        if(answer.charAt(answer.length()-1)=='.') {
	        	if(answer.length()==1) {
	        		answer="a";
	        	}else {
	        		answer = answer.substring(0,answer.length()-1);
	                		
	        	}
	        }

	        //Step 5
	        
	        
	        if(new_id.equals("")) {
	        	answer ="a";
	        }

	        //Step 6
	        if(answer.length()>15) {
	        	answer = answer.substring(0,15);
	        }
	        if(answer.charAt(answer.length()-1)=='.') {
	        	answer = answer.substring(0,answer.length()-1);
	        }

	        //Step 7

	        if(answer.length()<3) {
	        	while(answer.length()!=3) {
	        		answer+=answer.charAt(answer.length()-1);
	        	}
	        }

	       

	        return answer;
	    }
	}