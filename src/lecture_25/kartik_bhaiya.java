package lecture_25;

import java.util.Scanner;

public class kartik_bhaiya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        String s= sc.next();
        int flip_a=MaxLenofString(s,'a',k);
        int flip_b=MaxLenofString(s,'b',k);
        System.out.println(Math.max(flip_a,flip_b));
    }
    public static int MaxLenofString(String s,char ch,int k){
int si=0;
int ei=0;
int ans=0;
int flip=0;
while(ei<s.length()){
    if(s.charAt(ei)==ch){
        flip++;
    }
    while(flip>k && si<=ei){
        if(s.charAt(si)==ch){
            flip--;
        }
        si++;
    }
    ans=Math.max(ans,ei-si+1);
    ei++;
}
return ans;
    }
}
