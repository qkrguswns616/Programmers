package level2_page1;
import java.util.ArrayList;
import java.util.HashMap;
class RenuwalMenus {
    public int[] courseCount;
	 public HashMap<Integer, ArrayList<String>> resultMap = new HashMap<>();
	 public String[] solution(String[] orders, int[] course) {
	        String[] answer = {};
	        courseCount = new int[course.length];
	        
	        ArrayList<String> result = new ArrayList<>();
	        
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(int i=0; i<orders.length; i++) {
	        	for(int j=0; j<orders[i].length(); j++) {
	        		char temp= orders[i].charAt(j);
	        		if(!map.containsKey(temp)) {
	        			map.put(temp, 1);
	        		}else {
	        			map.put(temp, map.get(temp)+1);
	        		}
	        	}
	        }
	        
	       ArrayList<Menu> menuList= new ArrayList<Menu>();
	       
	       for(char key : map.keySet()) {
	    	   if(map.get(key)>1)
	    		   menuList.add(new Menu(key, map.get(key)));
	       }
	       
	       for(int i=0; i<course.length; i++) {
	    	   StringBuilder menu = new StringBuilder();
	    	   createMenu(menuList,orders, 0,i, course[i],menu);
	       }
	        
	       for(int key : resultMap.keySet()) {
	    	   result.addAll(resultMap.get(key));
	       }
	        
	        
	        
	        result.sort(null);
	        answer = new String[result.size()];
	        for(int i=0; i<result.size(); i++) {
	        	answer[i] = result.get(i);
	        }
	       
	        return answer;
	    }
	 
	 public void createMenu(ArrayList<Menu> menuList, String[] orders,int index,int courseIndex, int menuCount, StringBuilder menu) {
		 if(menu.length()==menuCount) {
			 //Check
			 int count=0;
			 for(int i=0; i<orders.length; i++) {
				 boolean check = true;
				 for(int j=0; j<menu.length(); j++) {
					 if(orders[i].indexOf(menu.toString().charAt(j))==-1) {
						 check = false;
						 break;
					 }
				 }
				 if(check) {
					 count++;
				 }
			 }
			 
		
			 
			 if(courseCount[courseIndex]<count && count > 1) {
				 courseCount[courseIndex] = count;
				 resultMap.put(menuCount, new ArrayList<String>());
				 resultMap.get(menuCount).add(menu.toString());
			 }else if(courseCount[courseIndex]==count && count!=0) {
				 resultMap.get(menuCount).add(menu.toString());
			 }
			 
			 return;
		 }
		 else if(index == menuList.size()) {
			 return;
		 }
		 
		
		 StringBuilder tempMenu = new StringBuilder();
		 tempMenu.append(menu.toString());
		 tempMenu.append(menuList.get(index).alpha);
		 
		 //선택
		 createMenu(menuList, orders, index+1, courseIndex,menuCount, tempMenu);
		 //선택 안함
		 createMenu(menuList, orders, index+1,courseIndex, menuCount, menu);
		 
		 
	 }
	 
	
}

class Menu{
	char alpha;
	int count = 1;
	
	public Menu(char alpha, int count) {
		this.alpha = alpha;
		this.count = count;
	}
	public void increaseCount() {
		this.count++;
	}
	public char getAlpha() {
		return alpha;
	}
	public int getCount() {
		return count;
	}
}