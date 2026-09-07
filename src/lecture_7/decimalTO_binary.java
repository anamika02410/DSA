package lecture_7;

import java.util.Scanner;

public class decimalTO_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        while(n!=0){
            int rem=n%2;
            sum=sum+rem*i;
            i=i*10;
            n=n/2;
        }
        System.out.println("binary representation of given number is:"+ sum);
    }
}
