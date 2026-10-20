package lecture_39;

public class merge_sort {
    public static void main(String[] args) {
        int[]arr={5,1,3,4,2};
        arr=sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sort(int[]arr,int si,int ei){
        if(si==ei){
            int[]base=new int[1];
            base[0]=arr[ei];
            return base;
        }
        int mid=si+(ei-si)/2;
        int[]right=sort(arr,si,mid);
        int[]left=sort(arr,mid+1,ei);
        return merge(right,left);
    }
    public static int[] merge(int[]arr1,int[]arr2){
        int n=arr1.length;
        int m= arr2.length;
        int[]ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
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
            k++;
            j++;
        }
        return ans;
    }
}
