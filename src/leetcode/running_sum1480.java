package leetcode;

public class running_sum1480 {
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
         int[]ans=running(nums);
         for(int i=0;i<ans.length;i++){
             System.out.println(ans[i]);
         }
    }
    public static int[] running(int[]nums){
        int n=nums.length;
        int[]ans=new int[n];
        int sum=0;
        for(int i=0;i<ans.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
