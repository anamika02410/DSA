package leetcode;

public class valid_anagram {
    public static void main(String[] args) {
        String s="silent";
        String t="listen";
        String a="anamika";
        String y="yashika";
        System.out.println(anagram(s,t));
        System.out.println(anagram(a,y));
    }
    public static boolean anagram(String s,String t){
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++) {
                for (int j = 0; j < t.length(); j++) {
                    while (s.charAt(i) == t.charAt(j)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
