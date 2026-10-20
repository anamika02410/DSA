package lecture_38;

public class pow_log {
    public static void main(String[] args) {
       int x=3;
       int n=5;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=power(x,n/2);
        ans=ans*ans;
        if(n%2!=0){
            ans=ans*x;
        }
        return ans;
    }
}

