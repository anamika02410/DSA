package pattern;

import java.util.Scanner;

public class question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n / 2;
        int space2=-1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            System.out.print("* ");
            int m=1;
            while (m<=space2){
                System.out.print("  ");
                m++;
            }
            if(row>=2 && row<n) {
                System.out.print("* ");
            }
           if(row<n/2+1){
               space2=space2+2;
               space--;

           }
           else {
               space2=space2-2;
               space++;
           }
           row++;
           System.out.println(" ");
       }
        }
    }

