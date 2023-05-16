/*
 * find the no in the array
i/p: 10 20 30 40;
Target no is 30;
o/p : 30 is present in the array at index 2;
*/
import java.io.*;
class TargetNo {
        public static void main(String args[])throws IOException {
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("enter array size : ");
                 int size = Integer.parseInt(br.readLine());
                 int arr[] = new int [size];
                 System.out.println("enter array elements : ");
                 for(int i = 0; i<size; i++) {
                         arr[i] = Integer.parseInt(br.readLine());
                 }
                 System.out.println("enter target number : ");
                 int Target = Integer.parseInt(br.readLine());
                 for(int i = 0; i<size; i++) {
                         if(arr[i]==Target) {
                                 System.out.println(Target+" is present in the array at index "+i);
                         }
                 }
        }
}
