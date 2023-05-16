/*
 Take no.of rows from the user
E D C B A
E D C B
E D C
E D
E
*/
import java.io.*;
class Pattern5 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter Number of rows");
                int row = Integer.parseInt(br.readLine());

                for (int i = 1; i <= row; i++) {
                        char ch = (char)('A'+(row-1));
                        for (int j = 1; j <= ((row-i)+1); j++) {
                                System.out.print(ch-- +" ");
                        }
                        System.out.println();
                 }
         }
}
