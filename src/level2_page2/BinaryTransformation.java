package level2_page2;

public class BinaryTransformation {
	public int[] solution(String s) {
		int[] answer = {};
		answer = new int[2];
		
		int len;
		int count;
		while(!s.equals("1")) {
			len = s.length();
			count=0;
			for(int i=0; i<len; i++) {
				if(s.charAt(i)=='1') 
					count++;
			}
			s = toBinary(count);
			answer[1]+=len-count;
			answer[0]++;
		}
		
		
		return answer;
		
	}
	
	public String toBinary(int num) {
		
		StringBuilder sb = new StringBuilder();
		
		while(num!=1) {
			sb.append(num%2);
			num/=2;
		}
		sb.append(1);
		
		return sb.toString();
	}
}