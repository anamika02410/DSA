package lecture_21;

import java.util.Arrays;
import java.util.Scanner;

public class cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of stalls");
        int n = sc.nextInt();
        System.out.println("enter the number of cows");
        int cow = sc.nextInt();
        int[] stall = new int[n];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(mindistance(stall,cow));
    }

    public static int mindistance(int[] stall, int cow) {
        int low = stall[0];
        int hi = stall[stall.length - 1];
        int ans = 0;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (isitpossible(stall, cow, mid) == true) {
                ans = mid;
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] stall, int cow, int mid) {
        int p = stall[0];
        int count = 1;//kyunki ek cow ko to phle hi bitha rkhe h;
        for (int i = 0; i < stall.length; i++) {
            if (stall[i] - p >= mid) {
                count++;
                p = stall[i];
            }
            if (count == cow) {
                return true;
            }
        }
        return false;
    }
}
