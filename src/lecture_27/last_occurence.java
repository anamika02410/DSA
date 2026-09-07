package lecture_27;

public class last_occurence {
    public static void main(String[] args) {
        int []arr={2,3,5,3,5,7,11,3,11,8};
        int item=3;
        System.out.println(last(arr,arr.length-1,3));
    }
    public static int last(int []arr,int i,int item){
       if(i== arr.length) {
           return -1;
       }
       if(arr[i]==item){
           return i;
       }
       return last(arr,i-1,3);
    }
}
