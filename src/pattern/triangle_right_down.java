package pattern;

import java.util.Scanner;

public class triangle_right_down{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=n){
            int i=n;
            while (i>=space) {
                System.out.print("  ");
                i--;

            }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            System.out.println();
            space--;
            star--;
        }
    }
}
