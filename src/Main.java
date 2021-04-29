import level2_page1.KakaoColoringBook;
import level2_page2.BiggestSquare;
import level2_page2.GameMap;

public class Main {

	public static void main(String[] args) {

		BiggestSquare bs = new BiggestSquare();
//		int[][] board = {{0,1,1,1},
//						{1,1,1,1},
//						{1,1,1,1},
//						{0,0,1,0}};
//		
//		
		int[][] board = {{1}};
		bs.solution(board);
	}

}
