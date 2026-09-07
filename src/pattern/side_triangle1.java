package pattern;

import java.util.Scanner;

public class side_triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= 2*n-1) {
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            if(row<n){
            star++;
            space--;
            }
            else {
            star--;
            space++;
            }
            row++;
            System.out.println(" ");
            //space--;
            //star++;

        }
    }
}

