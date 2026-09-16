package lecture_31;

public class lexco_counting {
    public static void main(String[] args) {
        int n=1000;
        print(0,n);
    }
    public static void print(int current,int n){
        if(current>n){
           return;
        }
        System.out.println(current);
        int i=0;
        if(current==0){
            i=1;
        }
        for(;i<=9;i++){
            print(current*10+i,n);
        }
    }
}
