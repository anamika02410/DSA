package lecture_26;

public class power_recursion {
    public static void main(String[] args) {
        int x=3;
        int n=5;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pow=power(x,n-1);
        return x*pow;
    }
}
