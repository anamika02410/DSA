package lecture_27;

public class all_index {
    public static void main(String[] args) {
        int []arr={2,3,5,3,5,7,11,3,11,8};
int item=3;
all(arr,0,3);
    }
    public static int all(int[]arr,int i,int item){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            System.out.println(i);
        }
        int ans=all(arr,i+1,3);
        return ans;
    }

}
