package lecture_15;

public class majority_value {
    public static void main(String[] args) {
        int[]arr={2,5,6,2,2,8,2,2,4};
        majority(arr);
    }
    public static int majority(int[]arr){
        int n=arr.length;
        int item=0;
        for(int i=0;i<n;i++){
            int first=arr[i];
            for(int j=1;j<n;j++){
                if(arr[i]==arr[j]){
                    item++;
                }
            }
        }
        return item;
    }
}
