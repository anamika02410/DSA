package lecture_19;

import java.util.Scanner;

public class spiral_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}, {14, 15, 16, 17}, {18, 19, 20, 21}};
        spiral(arr);
    }

    public static void spiral(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count=0;
        while (count<=total){
            for (int i = minr; i <= maxc; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}