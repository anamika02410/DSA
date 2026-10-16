package lecture_35;

public class single_sorted {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7, 11};
        int[] arr2 = {1, 2, 3, 7, 12, 13, 14, 15};
        int []ans=sorted(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] sorted(int[]arr1,int[]arr2){
        int n= arr1.length;
       int m=arr2.length;
        int[] ans = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}
