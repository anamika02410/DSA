package lecture_12;

import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={4,7,9,6,8,66,54};
        int high=arr[0];
        System.out.println("maximum element of given array");
        System.out.println(max(arr,high));
    }
    public static int max(int[]arr,int high){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        return high;
    }
}
