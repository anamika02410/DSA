package leetcode;

public class peak_element_162 {
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        int[]nums1={1,2,1,3,5,6,4};
        System.out.println(peak(nums1));
    }
    public static int peak(int[]nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]&& nums[i]>nums[i-1]){
                    ans= i;
                }
            }
        }
        return ans;
    }
}
