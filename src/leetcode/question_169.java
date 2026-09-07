package leetcode;

public class question_169 {
    public static void main(String[] args) {
        int[]arr={3,2,3};
        int[]nums={2,2,1,1,1,2,2};
        System.out.println(maximum(nums));
    }
    public static int maximum(int []arr){
        int count=1;
        int val=arr[0];
        for(int i=0;i<arr.length;i++) {
            val = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (val == arr[j]) {
                    count++;
                } else {
                    j++;
                }
            }
        }
        return val;
    }
}
