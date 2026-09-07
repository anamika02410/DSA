package lecture_9;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the minimum fahrenheit value");
        int min= sc.nextInt();
        System.out.println("enter the maximum fahrenheit value");
        int max= sc.nextInt();
        System.out.println("enter the number of step");
        int step=sc.nextInt();
        int i=min;
        while(i<=max){
            int c=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+c);
            i=i+step;
        }
    }
}
