package level2_page1;

public class BiggestNumber {
	 public String solution(String number, int k) {
	        String answer = "";
	        
	        StringBuilder sb = new StringBuilder();
	        for (int j = 0, index = -1; j < number.length() - k; j++) {
	            char max = 0;
	            for (int i = index + 1; i <= k + j; i++) {
	                if (max < number.charAt(i)) {
	                    index = i;
	                    max = number.charAt(i);
	                }
	            }
	            sb.append(max);
	        }
	        answer = sb.toString();
	        return answer;
	 }
}