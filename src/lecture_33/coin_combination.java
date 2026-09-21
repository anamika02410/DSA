package lecture_33;

public class coin_combination {
    public static void main(String[] args) {
        int[]coins={2,1,3,5};
        int target=4;
        combination(coins,target,"",0);
    }
    public static void combination(int[]coins,int target,String ans,int idx){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i< coins.length;i++){
            if (coins[i] <= target) {
                combination(coins,target-coins[i],ans+coins[i],i);
            }
        }
    }
}
