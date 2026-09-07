package leetcode;

public class question_1365 {
    public static void main(String[] args) {
        int[]nums={8,1,2,2,3};
        int[]ans=smaller(nums);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] smaller(int[]nums){
        int n= nums.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i])
                {
                    count++;
                    ans[i]=count;
                }
            }
        }
        return ans;
    }
}
