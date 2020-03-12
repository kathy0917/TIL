import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int result =0;
        String[] arrA = null;
        arrA = a.split("");

        ArrayList<String> lista = new ArrayList<String>(Arrays.asList(arrA));
        lista.remove(0);
    
        String[] arrB = null;
        arrB = b.split("");
        ArrayList<String> listb = new ArrayList<String>(Arrays.asList(arrB));
        listb.remove(0);

        if(lista.size()==1 || listb.size()==1 ){
            if(lista.get(0).equals(listb.get(0)))
            result = 0;
            else result = 2;
                    
        }else{
            for(int i=0;i<lista.size();i++){
                for(int j=0;j<listb.size();j++){
                    
                    if(lista.get(i).equals(listb.get(j))){
                        lista.remove(i);
                        listb.remove(j);
                        j = j-1;
                        i= i-1;
                        break;
                    }
                }
            }  result = lista.size() + listb.size(); 
        }
                

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
