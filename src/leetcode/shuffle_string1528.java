package leetcode;

import java.util.Scanner;

public class shuffle_string1528 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="codeleet";
        int[]arr={4,5,6,7,0,2,1,3};
         String ans=shuffle(str,arr);
        for(int i=0;i< ans.length();i++){
            System.out.print(ans.charAt(i));
        }

    }
    public static String shuffle(String str,int[]arr){
        char[]ans=new char[str.length()];
        for(int i=0;i<str.length();i++){
          ans[arr[i]]=str.charAt(i);
        }
        return  new String(ans);
    }
}
