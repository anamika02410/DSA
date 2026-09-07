package lecture_9;

import java.util.Scanner;

public class inverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int sum=0;
        int pos=1;
        while(n>0){
            int rem=n%10;
            sum=(int)(sum+pos*Math.pow(10,rem-1));
            pos++;
            n=n/10;
        }
        System.out.println(sum);
    }
}
