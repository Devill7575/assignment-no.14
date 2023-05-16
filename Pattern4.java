/*
 Take no.of rows from the user
3 b 1 d
a 2 c 0
3 b 1 d
a 2 c 0
*/
import java.io.*;
class Pattern4 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter Number of rows");
                int row = Integer.parseInt(br.readLine());

                for (int i = 1; i <=row; i++) {
                        int num = 3;
                        char ch = 'a';
                        for (int j = 1; j <=row; j++) {
                                if(i%2==0){
                                        if(j%2==0) {
                                                System.out.print(num+" ");
                                        }
                                        else{
                                                System.out.print(ch+" ");
                                        }
                                }
                                else{
                                        if(j%2==0) {
                                                System.out.print(ch+" ");
                                        }
                                        else{
                                                System.out.print(num+" ");
                                        }
                                }
                                ch++;
                                num--;
                        }
                        System.out.println();
                 }
         }
}
