package lecture_18;

import java.util.Scanner;

public class twoD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row= sc.nextInt();
        System.out.println("enter the number of column");
        int col=sc.nextInt();
        int[][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
