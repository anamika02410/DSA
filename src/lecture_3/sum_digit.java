package lecture_3;

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        while (n!=0){
            int i=n%10;
             n=n/10;
            sum=sum+i;
        }
        System.out.println( "sum of all digit of  the given number is:"+sum);
    }
}
