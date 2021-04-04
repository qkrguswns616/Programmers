package level1_page2;

public class AddDigits {
	public int solution(int n) {
        int answer = 0;

      String tempString = Integer.toString(n);
		
		
		for(int i=0; i<tempString.length();i++)
		{
			answer += Character.getNumericValue(tempString.charAt(i));
		}
		

        return answer;
    }
}
