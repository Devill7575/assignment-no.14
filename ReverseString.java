/*
        WAP to reverse a string
(without using predefine function)
i/p: Chetan
o/p: natehC
*/
import java.io.*;
class ReverseString {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter name");
                String str1 = br.readLine();
                StringBuffer str2 = new StringBuffer(str1);
                str1 = str2.reverse().toString();
                System.out.println(str1);
        }
}