package lecture_7;

import java.util.Scanner;

public class binaryTO_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        while (n!=0){
            int rem=n%10;
            sum=sum+rem*i;
            i=i*2;
            n=n/10;
        }
        System.out.println("decimal representation of the given binary number is:"+sum);
    }
}
