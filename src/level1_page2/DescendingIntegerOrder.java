package level1_page2;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingIntegerOrder {
	public long solution(long n) {
	      long answer = 0;
	     String s = Long.toString(n);
		    String s2[] = new String[s.length()];
		    for(int i=0; i<s.length(); i++)
		    {
		    	s2[i] = Character.toString(s.charAt(i));
		    }
		    
		    Arrays.sort(s2, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					
					if(o1.charAt(0)>o2.charAt(0))
					{
						return -1;
					}
					return 0;
					
				}
			});

		   String result = "";
		    for(int i=0; i<s.length(); i++)
		    {
		    	result+=s2[i];
		    }
		   answer = Long.valueOf(result);
	      return answer;
	  }
	}
