package lecture_25;

public class Ksize_maxsubarray {
    public static void main(String[] args) {
        int k=3;
        int[]arr={2,1,3,4,5,1,3,7,8,4,1};
        int ans=sum(arr,k);
        System.out.println(ans);

    }
    public static int sum(int[]arr,int k){
        int sum=0;
        int ans=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
       ans=sum;
        for(int i=k;i< arr.length;i++){
            sum=sum+arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
