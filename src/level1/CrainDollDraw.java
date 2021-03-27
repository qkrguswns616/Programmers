package level1;

import java.util.Stack;

public class CrainDollDraw {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
         int[] index = new int[board[0].length];
        Stack stack = new Stack();
        
        for(int i=0; i<board.length; i++)
        {
        	for(int j=0; j<board[i].length; j++)
        	{
        		if(board[j][i]!=0)
        		{
        			index[i] = j;
        			break;
        		}
        	}
        }
        
        
        for(int i=0; i<moves.length; i++)
        {
        	int position = index[moves[i]-1];
        	
        	if(position >= board[0].length)
        		continue;
        	
	        if(stack.isEmpty())
	        	stack.push(Integer.toString(board[position][moves[i]-1]));
	        else
	        {
	        	if(stack.peek().equals(Integer.toString(board[position][moves[i]-1])))
	        	{
	        		stack.pop();
	        		answer++;
	        	}
	        	else
	        	{
	        		stack.push(Integer.toString(board[position][moves[i]-1]));
	        	}
	        }
	        
	        	
	        index[moves[i]-1] = position+1;
        	
        }
        answer *=2;


        return answer;
    }
}