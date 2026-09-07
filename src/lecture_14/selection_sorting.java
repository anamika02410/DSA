package lecture_14;

public class selection_sorting {
    public static void main(String[] args) {
        int []a={5,3,-7,4,8,2};
        sort(a);
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int[]a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
                    int temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                }

            }
        }

