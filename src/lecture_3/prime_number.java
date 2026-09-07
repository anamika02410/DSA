package lecture_3;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println(" not prime");
        }
        else {
            System.out.println(" prime ");
        }

    }
}
