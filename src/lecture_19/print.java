package lecture_19;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row= sc.nextInt();
        System.out.println("enter the number of columns");
        int col= sc.nextInt();
        int[][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        display(arr);
    }
    public static void display(int[][]arr){
        int i= arr.length;
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
