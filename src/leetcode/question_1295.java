package leetcode;

public class question_1295 {
    public static void main(String[] args) {
        int[]nums={12,345,2,6,7896};
        System.out.println(count(nums));
    }
    public static int count(int[]nums) {
        int n = nums.length;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = nums[i];
            while (num > 0) {
                count++;
                num = num / 10;
            }

            if (count % 2 == 0) {
                even = even + 1;
            }
        }
        return even;
    }
}
