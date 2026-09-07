package leetcode;

import java.util.Scanner;

public class gyess_game374 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int guess=sc.nextInt();
        System.out.println(guess(n,guess));
    }
    public static int guess(int n,int guess){
        if(guess<n){
            return 1;
        }
        else if(guess==n){
            return 0;
        }
        return -1;
    }
}
