import java.io.*;
class PalindromeString {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter String");
                String str1 = br.readLine();
                StringBuffer str = new StringBuffer(str1);
                String str2 = str.reverse().toString();
                if(str1.equals(str2)) {
                        System.out.println(str1+" is palindrome");
                }
                else{
                        System.out.println(str1+" is not palindrome");
                }
        }
}
