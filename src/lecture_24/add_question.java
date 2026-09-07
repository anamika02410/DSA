package lecture_24;

import java.util.ArrayList;

public class add_question {
    public static void main(String[] args) {
        int[]arr={2,3,4,6};
        int[]arr2={8,3,5,3,4,7,6};
        Addnumber(arr,arr2);
    }
    public static void Addnumber(int[]arr,int[]arr2){
        ArrayList<Integer>l1=new ArrayList<>();
        int i= arr.length-1;
        int j= arr2.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=arr[i]+arr2[j]+carry;
            l1.add(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr[i]+carry;
            l1.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            l1.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            l1.add(carry);
        }
        for(int k= l1.size()-1;k>=0;k--){
            System.out.print(l1.get(k)+" ");
        }
    }
}
