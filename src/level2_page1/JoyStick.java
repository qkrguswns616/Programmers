package level2_page1;

import java.util.ArrayList;

public class JoyStick {
	public static int tempAnswer=Integer.MAX_VALUE;
	public int solution(String name) {
        int answer = 0;
        
        
        if(name.length()==1) {
        	if(name.charAt(0) > 78) {
    			answer = answer + 90 - name.charAt(0)+1;
    		}else {
    			answer = answer + name.charAt(0)-65;
    		}
        	return answer;
        }

        ArrayList<Character> now = new ArrayList<>();
        ArrayList<Character> now2 = new ArrayList<>();

        for(int i=0; i<name.length(); i++) {
        	now.add('A');
        	now2.add('A');
        }
        

        
        move(name,now,0,0, "right",false);
        
        int count=0;
        
        if(name.charAt(0)=='A') {
        	move(name,now2,1,name.length()-1,"left",false);
        }
        else {
        	if(name.charAt(0) > 78) {
    			count = count + 90 - name.charAt(0)+1;
    		}else {
    			count = count + name.charAt(0)-65;
    		}
    		now2.set(0, name.charAt(0));
    		
            move(name,now2,count+1,name.length()-1, "left",false);	
        }
        
        answer = tempAnswer;
        
        return answer;
    }
	
	public void move(String name, ArrayList<Character> now, int count, int index, String dir, boolean isTurn) {
		boolean isEqual = true;
		
		if(now.get(index)!=name.charAt(index)) {
			if(name.charAt(index) > 78) {
				count = count + 90 - name.charAt(index)+1;
			}else {
				count = count + name.charAt(index)-65;
			}
			now.set(index, name.charAt(index));	
		}
		
		
		if(tempAnswer <count)
			return;
		
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)!=now.get(i)){
				isEqual = false;
				break;
			}
		}
		if(isEqual) {

			if(tempAnswer > count)
				tempAnswer = count;
			
			return;
		}
		if(dir.equals("right")) {
			count++;
			
			if(index==name.length()-1) {
				move(name,(ArrayList<Character>) now.clone(),count,0,dir,isTurn);	
			}else {				
				move(name,(ArrayList<Character>) now.clone(),count,index+1,dir,isTurn);	
			}
	
			if(!isTurn) {
				if(index==0) {
					move(name,(ArrayList<Character>) now.clone(),count,name.length()-1,"left",true);	
					
				}else {
					move(name,(ArrayList<Character>) now.clone(),count,index-1,"left",true);	
				}
					
			}
		}else {
			count++;

			if(index==0) {
				move(name,(ArrayList<Character>) now.clone(),count,name.length()-1,dir,isTurn);
				
			}else {
				move(name,(ArrayList<Character>) now.clone(),count,index-1,dir,isTurn);
					
			}
			if(!isTurn) {
				if(index==name.length()-1) {
					move(name,(ArrayList<Character>) now.clone(),count,0,"right",true);
				}else {
					move(name,(ArrayList<Character>) now.clone(),count,index+1,"right",true);	
				}
			}
		}
		
		
	}
}
