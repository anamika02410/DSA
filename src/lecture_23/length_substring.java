package lecture_23;

import java.util.Scanner;

public class length_substring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.next();
        substring(str);
    }
    public static void substring( String str){
        for(int len=1;len<=str.length();len++){
          for(int j=len;j<=str.length();j++){
              //j-i=len
              int i=j-len;
              System.out.println(str.substring(i,j));
          }
        }
    }
}
