package level1_page1;

public class GymSuit {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
            int[] clothes = new int[n];
        
        for(int i=0; i<clothes.length; i++)
        {
        	clothes[i]++;
        }
        for(int i=0; i<lost.length;i++)
        {
        	clothes[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length;i++)
        {
        	clothes[reserve[i]-1]++;
        }
        
        for(int i=0; i<clothes.length; i++)
        {
        	if(clothes[i]==2)
        	{
        		if(i-1>=0 && clothes[i-1]==0)
        		{
        			clothes[i-1]++;
        			clothes[i]--;
        		}
        		else if(i+1<clothes.length && clothes[i+1]==0)
        		{
        			clothes[i+1]++;
        			clothes[i]--;
        		}
        	}
        }
        
        for(int i=0; i<clothes.length; i++)
        {
        	if(clothes[i]!=0) answer++;
        }
        
        
        return answer;
    }
}