package leetcode;

public class question_1920 {
    public static void main(String[] args) {
        int[]nums={0,1,2,5,3,4};
        int[]ans=permutation(nums);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    public static int[] permutation(int[]nums){
        int[]ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
