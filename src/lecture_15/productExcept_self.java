package lecture_15;

public class productExcept_self {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        product(arr);
    }
    public static void product(int []arr){
        int n=arr.length;
        int []answer=new int[n];
        int product=1;
        for(int i=0;i<n;i++) {
            product = (product * arr[i]);
        }
        for(int i=0;i<n;i++){
            answer[i]=product/arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
