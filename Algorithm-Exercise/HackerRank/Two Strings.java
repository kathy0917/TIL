import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String result = "";

        String[] str1 = null;
        str1 = s1.split("");
       
        String[] str2 = null;
        str2 = s2.split("");

        
        HashSet<String> set = new HashSet<String>();
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();

          
          for(int i=1; i<str1.length;i++){
            set1.add(str1[i]);            
            }
          for(int i=1; i<str2.length;i++){
            set2.add(str2[i]);
            }
            Iterator<String> iterator = set1.iterator();
            while(iterator.hasNext()){
                String str = iterator.next();
                set.add(str);
            }
            Iterator<String> iterator2 = set2.iterator();
            while(iterator2.hasNext()){
                String str = iterator2.next();
                set.add(str);
            }

            
        
        if(set.size() == (set1.size() + set2.size())){
            result = "NO";
        }else if(set.size() != set1.size() + set2.size())
            result = "YES";

        
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
