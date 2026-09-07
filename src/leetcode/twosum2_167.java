package leetcode;

public class twosum2_167 {
    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        int target=9;
        int[] ans=sum(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] sum(int[]arr,int target){
        int[]ans=new int[2];
       for(int i=0;i< arr.length;i++){
           for(int j=i+1;j< arr.length;j++){
               if(arr[i]+arr[j]==target){
                   ans[i]=i+1;
                   ans[j]=j+1;
               }
           }
       }
       return ans;

    }
}
