package lecture_3;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter the term of fibonacci number");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int i=1;
        while(i<n){
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(b);
    }
}
//9931056522
