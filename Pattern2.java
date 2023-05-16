/*
 Take no.of rows from the user
D C B A
e d c b
F E D C
g f e d
*/
import java.io.*;
class Pattern2 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter Number of rows");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <=row; i++) {
            char char1 = (char) ('d' + i);
            if (i % 2 != 0) {
                char1 = (char) ('D' + i);
            }
            for (int j = 1; j <=row; j++) {
                char char2 = (char) (char1 - j);
                System.out.print(char2 + " ");
            }
            System.out.println();
        }
    }
}
