package lecture_36;

public class correct_position {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 8, 1, 4};
        System.out.println(print(arr));
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
    public static int[] print(int[]arr){
        int si = 0;
        int ei= arr.length-1;
        for(int i=0;i<ei;i++){
            for(int j=i+1;j<=ei;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }
}
