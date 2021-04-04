package level1_page3;

import java.util.Scanner;

public class TakeAllStars {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("*");
            }
            if(i!=b) System.out.println();
        }

        //System.out.println(a + b);
    }
}
