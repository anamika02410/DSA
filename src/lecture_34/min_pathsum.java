package lecture_34;

public class min_pathsum {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        solve(arr,-1,0,"",0);
    }
    public static void solve(int[][]arr,int row,int col,String ans,int sum){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.print(ans);
            System.out.println("="+sum);
            return;
        }
        int []r={-1,0,1,0};
        int[]c={0,1,0,-1};
        for(int i=0;i<c.length;i++){
            int nr=row+r[i];
            int nc=col+c[i];

            if(nr>=0 && nc>=0 && nr<=arr.length-1 && nc<=arr[0].length-1){
                if(arr[nr][nc]>0){
                    int val=arr[nr][nc];
                    arr[nr][nc]=0;
                    solve(arr,nr,nc,ans+val+"-->",sum+val);
                    arr[nr][nc]=val;
                }
            }
        }
    }
}
