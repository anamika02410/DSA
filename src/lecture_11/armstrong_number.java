package lecture_11;

import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(is_armstrong(n));
    }

    public static boolean is_armstrong(int n) {
        int original=n;
        int sum = 0;
        int d = count(n);
        while (n > 0) {
            int rem = n % 10;
            sum =  (int) (sum+Math.pow(rem, d));
            n = n / 10;
        }
        System.out.println(sum);
        if(sum==original){
            return true;
        }
        else {
            return false;
        }
    }

        public static int count ( int n){
            int count = 0;
            while (n > 0) {
                count++;
                n = n / 10;
            }
            return count;
        }
}







