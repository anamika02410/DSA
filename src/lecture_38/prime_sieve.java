package lecture_38;

import java.util.Scanner;

public class prime_sieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        prime(n);
    }
    public static void prime(int n){
        int count=0;
        boolean[] board=new boolean[n+1];
        for(int i=2;i<board.length;i++){
            board[i]=true;
        }
        for(int i=2;i*i< board.length;i++){
                if(board[i]==true){
                    for(int j=2;j*i< board.length;j++){
                     board[i*j]=false;
                }
            }
        }
        for(int i=2;i< board.length;i++){
            if(board[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}

