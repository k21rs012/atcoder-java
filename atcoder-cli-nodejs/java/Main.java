import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(n));
    }

    static String solve(int n) {
        String result = "";
        // StringBuilder result = new StringBuilder("");
        //int result = 0;

        return result;
    }
}
