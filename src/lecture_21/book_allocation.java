package lecture_21;

import java.util.Arrays;
import java.util.Scanner;

public class book_allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of books");
        int n= sc.nextInt();
        System.out.println("enter the number of students");
        int m= sc.nextByte();
        int[]book=new int[n];
        for(int i=0;i<n;i++){
            book[i]= sc.nextInt();
        }
        Arrays.sort(book);
    }
    public static int allocation(int[]book){
        int lo=0;
        int sum=0;
        for(int i=0;i<book.length;i++){
            sum=sum+book[i];
        }
        int hi=sum;
        while(lo<=hi){
            int mid=(lo+hi)/2;
        }
        return sum;
    }
}
