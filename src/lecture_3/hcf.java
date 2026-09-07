package lecture_3;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor");
        int divisor = sc.nextInt();
        if(divisor<=dividend){
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
                System.out.println("hcf of given dividend is:" + divisor);
            }
        else{
                System.out.println(" not applicable");
            }
        }
    }
