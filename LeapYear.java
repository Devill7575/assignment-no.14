/*
 * check the leap year
A leap year exactly divisible by 4 Except for century year (year ending with 00)
The century year is leap year only if it perfectly Divible by 400.
*/
import java.io.*;
class LeapYear {
        public static void main(String args[])throws IOException {
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("enter year");
                 int year = Integer.parseInt(br.readLine());
                 if(year%4==0) {
                         System.out.println(year+" is a leap year");
                 }
                 else{
                         System.out.println(year+" is not a leap year");
                 }
        }
}