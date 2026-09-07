package leetcode;

public class subarrayProduct_lessK713 {
    public static void main(String[] args) {
        int[]nums={10,5,2,6};
        int k=100;
        int count=product(nums,k);
        System.out.println(count);
    }
    public static int product(int[]nums,int k){
        int product=1;
        int count=0;
        int i=0;
        int si=0;
        while(i<nums.length){
            product=product*nums[i];

        while(product>=k && si<=i){
            product=product/nums[si];
            si++;
        }
        count=count+(i-si+1);
        i++;
    }
    return count;
}
}
