package lecture_7;

import java.util.Scanner;

public class decimalTO_octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(n!=0){
            int rem=n%8;
             sum=sum+rem*i;
             i=i*10;
             n=n/8;
        }
        System.out.println("octal representation of given decimal number is:"+sum);
    }
}
