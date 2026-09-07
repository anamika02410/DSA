package lecture_14;

public class insertion_sort {
    public static void main(String[] args) {
        int[]a={3,5,8,2,4,6,-4};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int[]a){
        for(int i=1;i<a.length;i++){
            int picked=a[i];
            int j=i-1;
            while(j>=0 && a[j]>picked){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=picked;
        }
    }
}
