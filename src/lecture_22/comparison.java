package lecture_22;

public class comparison {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3="helli";
        System.out.println(equals(str1,str2));
        System.out.println(equals(str1,str3));
        System.out.println(str3.substring(1,4));
    }
    public static boolean equals( String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1==str2){
            return true;
        }
            for(int i=0;i<str1.length();i++){
                if (str1.charAt(i)!=str2.charAt(i)) {
                    return false;
                }
            }
        return true;
    }
}
