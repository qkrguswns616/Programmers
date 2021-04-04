package level1;

public class Tzos {
	public String solution(int a, int b) {
	      String answer = "";
	      
	      int day=0;
	      for(int i=1; i<a; i++)
	      {
	          switch(i)
	          {
	              case 1: day+=31; break;
	              case 2: day+=29; break;
	              case 3: day+=31; break;
	              case 4: day+=30; break;
	              case 5: day+=31; break;
	              case 6: day+=30; break;
	              case 7: day+=31; break;
	              case 8: day+=31; break;
	              case 9: day+=30; break;
	              case 10: day+=31; break;
	              case 11: day+=30; break;
	          }
	      }
	      day+=b;
	      
	      switch(day%7)
	      {
	          case 0: answer = "THU"; break;
	          case 1: answer = "FRI"; break;
	          case 2: answer = "SAT"; break;
	          case 3: answer = "SUN"; break;
	          case 4: answer = "MON"; break;
	          case 5: answer = "TUE"; break;
	          case 6: answer = "WED"; break;
	      }
	      return answer;
	  }
	}