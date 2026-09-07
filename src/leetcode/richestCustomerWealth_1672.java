package leetcode;

public class richestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] account = {{1, 2, 3}, {3, 2, 1}};
        int[][]accounts={{1,5},{7,3},{3,5}};
        int max = richest(accounts);
        System.out.println(max);
    }
    public static int richest(int[][]account){
        int[] ans=new int[account.length];
        for(int i=0;i< account.length;i++) {
            int sum = 0;
            for (int j = 0; j < account[0].length; j++) {
                sum = account[i][j] + sum;
            }
            ans[i] = sum;
        }
        int max=ans[0];
        for(int i=1;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}
