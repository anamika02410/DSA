package lecture_33;

public class coin_permutation {
    public static void main(String[] args) {
        int[]coins={2,1,3,5};
        int target=4;
        print(coins,target,"");
    }
    public static void print(int[]coins,int target,String ans){
        if(target==0){
            System.out.println(ans);
            return;
        }
            for(int i=0;i< coins.length;i++){
                if(coins[i]<=target){
                    print(coins,target-coins[i],ans+coins[i]);
                }
            }
    }
}
