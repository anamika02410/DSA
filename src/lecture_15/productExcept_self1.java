package lecture_15;

public class productExcept_self1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        product(arr);
    }
    public static void product(int[]arr){
        int n=arr.length;
        int product=1;
        int[]answer=new int[n];
        int[]left=new int[n];
        left[0]=1;
        int[]right=new int[n];
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i]=left[i]*right[i];
            System.out.print(answer[i]+" ");
        }
    }
}
