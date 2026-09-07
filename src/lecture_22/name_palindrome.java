package lecture_22;

import java.util.Scanner;

public class name_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.next();
        String str="ana";
        String s="anamika";
        System.out.println(palindrome(st));
        System.out.println(palindrome(str));
    }
    public static boolean palindrome( String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        return true;
    }
}
