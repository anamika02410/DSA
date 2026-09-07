package leetcode;

public class maximum_vowels1456 {
    public static void main(String[] args) {
        String str="abciiidef";
        int k=3;
        int ans=maximum(str,k);
        System.out.println(ans);
    }
    public static boolean isVowel(char ch){
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u';
    }
    public static int maximum(String str,int k){
        int count=0;
        for(int i=0;i<k;i++){
          if(isVowel(str.charAt(i))){
              count++;
          }
        }
        int ans=count;
        for(int i=k;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
            if(isVowel(str.charAt(i-k))){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
