package pattern;

import java.util.Scanner;

public class triangle_downward {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=n+4;
        while(row<=n)
        {
            int i=1;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=(star)){
                System.out.print("* ");
                j++;
            }
             row++;
            System.out.println();
            space+=2;
            star-=2;
        }
    }
}
