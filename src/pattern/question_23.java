package pattern;

import java.util.Scanner;

public class question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            while (j <= star) {
                System.out.print(row+" " );
                j++;
            }
            row++;
            System.out.println(" ");
            star = star + 2;
            space--;
        }
    }
}
