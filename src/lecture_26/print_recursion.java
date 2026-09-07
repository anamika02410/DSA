package lecture_26;

public class print_recursion {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n==0){
          return;
        }
        System.out.println(n);
        print(n-1);
    }
}
