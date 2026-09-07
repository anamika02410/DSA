package leetcode;

public class bruteforce_875 {
        public int minEatingSpeed(int[] piles, int h) {
            int speed=1;
            while(true){
                int sum=0;
                for(int i=0;i<piles.length;i++){
                    int time=piles[i]/speed;
                    if(piles[i]%speed!=0){
                        time++;
                    }
                    sum=sum+time;
                }
                if(sum<=h){
                    break;
                }
                speed++;
            }
            return speed;
        }
    }

