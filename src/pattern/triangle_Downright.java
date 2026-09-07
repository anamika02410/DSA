package pattern;

import java.util.Scanner;

public class triangle_Downright {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=n;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
            i--;
        }

    }
}
