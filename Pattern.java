/*
 Take no.of rows from the user
0  3  8
15 24 35
48 63 80
*/
import java.io.*;
class Pattern {
        public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter Number of rows");
		int row = Integer.parseInt(br.readLine());
                int num = 0;
                int diff = 3;
                for (int i =1; i<=row; i++) {
                        for(int j=1; j<=row; j++) {
                                System.out.print(num+ " ");
                                num = num+diff;
                                diff=diff+2;
                        }
                        System.out.println();
                }
        }
}
