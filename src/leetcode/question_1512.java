package leetcode;

public class question_1512 {
    public static void main(String[] args) {
        int[]nums={1,2,3,1,1,3};
        int[]arr={1,1,1,1};
        System.out.println(pair(nums));
        System.out.println(pair(arr));
    }
    public static int pair(int[]nums){
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    p++;
                }
            }
        }
        return p;
    }
}
