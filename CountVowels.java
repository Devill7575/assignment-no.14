import java.io.*;
class CountVowels {
        public static void main(String args[])throws IOException {
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("enter string");
                 String str = br.readLine();
                 int count = 0;
                 for (int i = 0; i < str.length(); i++) {
                         char ch = str.charAt(i);
                         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                                 count++;
                         }
                 }
                 System.out.println("total count of vowels = "+count);
        }
}