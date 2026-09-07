package pattern;

import java.util.Scanner;

public class question_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int k=1;
            while (j <=star) {
                System.out.print(k+" ");
                if(j<=star/2){
                    k++;
                }
                 else {
                     k--;
                }
                j++;
            }
            row++;
            System.out.println(" ");
            star+=2;
            space--;
        }
    }
}
