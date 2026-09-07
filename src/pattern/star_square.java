package pattern;

import java.util.Scanner;

public class star_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= 5) {
            int j=1;
            while (j <= 5) {
                System.out.print(" * ");
                j++;
            }
            System.out.println(" 5");
            i++;
        }
    }
}
