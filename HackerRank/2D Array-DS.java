import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int result=0;
        int sum[] = new int[(arr[0].length-2)*(arr.length-2)];
        int k=0;
        
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
              if(i<arr.length-2 && j<arr.length-2){
                    sum[k] = arr[i][j];
                    sum[k] += arr[i][j+1];
                    sum[k] += arr[i][j+2];
                    sum[k] += arr[i+1][j+1];
                    sum[k] += arr[i+2][j];
                    sum[k] += arr[i+2][j+1];
                    sum[k] += arr[i+2][j+2];
                    k++;
              }
              
              
           }
        }

    
        Arrays.sort(sum);
       
        result = sum[sum.length-1];
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
