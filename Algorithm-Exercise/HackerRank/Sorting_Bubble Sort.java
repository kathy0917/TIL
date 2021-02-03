import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int count = 0;
        int first = 0; 
        int last = 0; 
        int temp = 0;

        String firstline = "";
        String secondline = "";
        String thirdline = "";
        String result;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++;
                }

            }
        }
        first = a[0];
        last = a[a.length-1];

        firstline = "Array is sorted in " + count + " swaps.";
        secondline = "First Element: " + first;
        thirdline = "Last Element: " + last;

        result = firstline + "\n" + secondline + "\n" + thirdline;
       
        System.out.println(result); 
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
