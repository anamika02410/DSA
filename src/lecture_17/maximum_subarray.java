package lecture_17;

public class maximum_subarray {
    public static void main(String[] args) {
        int[]arr={2,3,-7,11,-1,3};
        int[]nums={2,-3,5,-1,4};
        System.out.println( sum(nums));
    }
    public static int sum(int[]arr){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for (int i= 0;  i< n; i++) {
            int sum=0;
            for (int j=i;j<n;j++){
                sum=sum+arr[j];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}
