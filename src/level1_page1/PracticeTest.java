package level1_page1;

public class PracticeTest {
	public int[] solution(int[] answers) {
    int[] answer = {};
    int[] result1 = {1,2,3,4,5}; //5
    int[] result2 = {2,1,2,3,2,4,2,5}; //8
    int[] result3 = {3,3,1,1,2,2,4,4,5,5}; //10
    int[] result = {0,0,0};
    
    for(int i=0; i<answers.length; i++)
    {
        if(result1[i%5]==answers[i]) result[0] ++;
        if(result2[i%8]==answers[i]) result[1]++;
        if(result3[i%10]==answers[i]) result[2] ++;
    }
    

    int max = 0;
    for(int i=0; i<3; i++)
    {
        if(max<result[i]) max = result[i];
    }
    
    int count = 0;
    for(int i=0; i<3; i++)
    {
        if(result[i]==max) count++;
    }
    
    answer = new int[count];
    count = 0;
    for(int i=0; i<3; i++)
    {
       if(result[i]==max) 
        {
            answer[count] = i+1;
            count++;
        }
    }
    
    
    
    return answer;
}
}