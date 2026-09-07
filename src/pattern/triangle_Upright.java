package pattern;

import java.util.Scanner;

public class triangle_Upright {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
           i++;
        }
    }
}
