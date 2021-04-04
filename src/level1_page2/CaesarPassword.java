package level1_page2;

public class CaesarPassword {
	 public String solution(String s, int n) {
	      String answer = "";
	      
	  for(int i=0; i<s.length();i++)
			{
				
				if(s.charAt(i)+1==33) answer += " "; 
				else if(s.charAt(i)+1>97 && s.charAt(i)-1<122)
				{
					if((s.charAt(i)+n)%122<25 && (s.charAt(i)+n)%122>0)
					{
						answer+= (char)(96+(s.charAt(i)+n)%122);
					}
					else
					{
						answer+= (char)((s.charAt(i)+n));
				
					}
					// 소문자
				}
				else if(s.charAt(i)+1>65 && s.charAt(i)-1<90)
				{
					if((s.charAt(i)+n)%90<25 && (s.charAt(i)+n)%90>0)
					{
						answer+= (char)(64+(s.charAt(i)+n)%90);
						
					}
					else
					{
						answer+= (char)((s.charAt(i)+n));
						
					}
					// 대문자
				}
						
			}
	      
	      return answer;
	  }
	}