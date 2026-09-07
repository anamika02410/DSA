package leetcode;

public class target_array1389 {
    public static void main(String[] args) {
        int[]nums={0,1,2,3,4};
        int[]index={0,1,2,2,1};
        int[]target=order(nums,index);
        for(int i=0;i<target.length;i++){
            System.out.println(target[i]);
        }
    }
    public static int[] order(int[]nums,int[]index){
        int n= nums.length;
        int[]target=new int[n];
        for(int i=0;i<n;i++) {
            for (int j = n - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
