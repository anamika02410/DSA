package pattern;

import java.util.Scanner;

public class question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int k=1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                    System.out.print(k + "\t");
                    j++;
                    k++;
                }
                row++;
                System.out.println(" ");
                star = star + 2;
                space--;
            }
        }
    }

