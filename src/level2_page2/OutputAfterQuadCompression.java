package level2_page2;

public class OutputAfterQuadCompression {
	public static int[] result = new int[2];
	 public int[] solution(int[][] arr) {
		 int[] answer = {};
		 answer = new int[2];
		 
		 if(arr.length==1) {
			 answer[arr[0][0]]++;
			 return answer;
		 }
		 
		 int len = arr.length/2;
		 
		 int num = arr[0][0];
		 boolean isSame=true;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr.length; j++) {
				 if(arr[i][j]!=num) {
					 isSame=false;
					 break;
				 }
			 }
		 }
		 if(isSame) {
			 result[num]++;
		 }else {
			 cal(arr,0,0,arr.length-1, arr.length-1,len);
			 	 
		 }
		 

		 answer[0]=result[0];
		 answer[1]=result[1];
		 
		 System.out.println(answer[0] + ", " + answer[1]);
		 return answer;
	    	
	 }
	 public void cal(int[][] arr, int sX, int sY,int eX,int eY, int len) {
		
		 int num;
		 boolean isSame;
		 //part1
		 isSame = true;
		 num = arr[sX][sY];
		 for(int i=0; i<len; i++) {
			 for(int j=0; j<len; j++) {
				 if(arr[sX+i][sY+j]!=num) {
					 isSame = false;
					 break;
				 }
			 }
		 }
		 if(isSame) {
			 result[num]++;
		 }else {
			 cal(arr,sX,sY,sX+len-1, sY+len-1,len/2);
		 }
		 //part2
		 isSame = true;
		 num = arr[sX][sY+len];
		 for(int i=0; i<len; i++) {
			 for(int j=0; j<len; j++) {
				 if(arr[sX+i][sY+len+j]!=num) {
					 isSame = false;
					 break;
				 }
			 }
		 }
		 if(isSame) {
			 result[num]++;
		 }else {
			 cal(arr,sX,sY+len,sX+len, sY+len+len-1,len/2);
		 }
		 //part3
		 isSame = true;
		 num = arr[sX+len][sY];
		 for(int i=0; i<len; i++) {
			 for(int j=0; j<len; j++) {
				 if(arr[sX+len+i][sY+j]!=num) {
					 isSame = false;
					 break;
				 }
			 }
		 }
		 if(isSame) {
			 result[num]++;
		 }else {
			 cal(arr,sX+len,sY,sX+len+len-1, sY+len,len/2);
		 }
		 //part4
		 isSame = true;
		 num = arr[sX+len][sY+len];
		 for(int i=0; i<len; i++) {
			 for(int j=0; j<len; j++) {
				 if(arr[sX+len+i][sY+len+j]!=num) {
					 isSame = false;
					 break;
				 }
			 }
		 }
		 if(isSame) {
			 result[num]++;
		 }else {
			 cal(arr,sX+len,sY+len,sX+len+len-1, sY+len+len-1,len/2);
		 }
	 }
}