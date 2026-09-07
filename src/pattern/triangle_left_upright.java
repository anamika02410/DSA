package pattern;

import java.util.Scanner;

public class triangle_left_upright {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while (row<=n){
        int i=1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
            int j =1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            row++;
            System.out.println(" ");
            space--;
            star++;
        }
    }
}

