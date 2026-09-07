package leetcode;

public class question_26 {
    public static void main(String[] args) {
        int[]arr= {1,1,2};
        int[]nums={0,0,1,1,1,2,2,3,3,4};
        remove(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] remove (int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for (int j = 1; j < n; j++) {
                arr[i] = Math.max(arr[i], arr[j]);
            }
        }
        return arr;
    }
}
