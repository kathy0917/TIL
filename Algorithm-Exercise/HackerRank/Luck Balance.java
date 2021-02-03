import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int result = 0; 
        int n=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
     
        for(int i=0;i<contests.length;i++){
            if(contests[i][1] == 1){
                list.add(contests[i][0]);
                
            }else if(contests[i][1] != 1){
                result += contests[i][0];
            }
        }
       
        if(list.size()!=0){
        Collections.sort(list);
       

        for(int i=0;i<list.size();i++){
            if(i<list.size()-k){
                result -= list.get(i);
            }else if(i>=list.size()-k){
                result += list.get(i);
            }
            
        }
        
    }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
