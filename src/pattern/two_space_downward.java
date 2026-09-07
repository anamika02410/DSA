package pattern;

import java.util.Scanner;

public class two_space_downward {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=n){
            int i=1;
            while (i<=space){
                System.out.print("    ");
                i++;
            }
           int j=n;
            while(j>=star){
                System.out.print("* ");
                j--;
            }
            row++;
            System.out.println();
            space--;
            star--;
        }
    }
}
