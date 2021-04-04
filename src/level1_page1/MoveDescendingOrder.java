package level1_page1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MoveDescendingOrder {
	public String solution(String s) {
	      String answer = "";
	      
	      ArrayList<String> list = new ArrayList<String>();
			
			for(int i=0; i<s.length();i++)
			{
				list.add(Character.toString(s.charAt(i)));
			}

			Collections.sort(list,new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {

					return o2.compareTo(o1);
				}
				
			});

			for(int i=0; i<list.size(); i++)
			{
				answer += list.get(i);
			}
	      return answer;
	  }
	}