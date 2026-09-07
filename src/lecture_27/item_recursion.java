package lecture_27;

public class item_recursion {
    public static void main(String[] args) {
        int[]arr={3,2,5,7,5,6,5,15,5};
        System.out.println(occur(arr,0,5));
    }
    public static int occur(int[]arr,int i,int item){
        if(arr[i]==item){
            return i;
        }
        return occur(arr,i+1,item);
    }
}
