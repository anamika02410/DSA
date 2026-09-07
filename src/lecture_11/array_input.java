package lecture_11;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(arr[4]);
    }
}
