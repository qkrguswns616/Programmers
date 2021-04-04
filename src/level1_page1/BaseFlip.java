package level1_page1;

public class BaseFlip {

	public int solution(int n) {
        int answer = 0;
        
        String base = "";
        while(n>2) {
        	base+=(n%3);
        	n/=3;
        }
        base+=n;
        
        
        for(int i=0; i<base.length(); i++) {
        	int digit = (int) Math.pow(3, base.length()-1-i);
        	answer += digit*Character.getNumericValue(base.charAt(i));
        }
        return answer;
    }
}

