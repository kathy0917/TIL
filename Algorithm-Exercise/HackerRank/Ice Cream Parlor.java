import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        int result_one =0;
        int result_two=0;
        int start_index = 0;
        int end_index = cost.length-1;
        int midpoint = 0;
        int flag = 0;
        int[] cost_sortbefore = new int[cost.length];
        for(int i=0;i<cost.length;i++){
            cost_sortbefore[i] = cost[i];
        }
    
        Arrays.sort(cost);
        int on = 0;
        for(int i=0;i<cost.length;i++){
            if(on == 0) {
            flag = money - cost[i];
            start_index = 0;
            end_index = cost.length-1;

        while(start_index <= end_index){
            midpoint = (start_index + end_index) / 2;
        
            if(cost[midpoint] == flag ){
                result_one = cost[i];
                result_two = cost[midpoint];
                on = 1;

                break;
            }
            if(flag < cost[midpoint]){
                end_index = midpoint - 1;
             
            }else{
                start_index = midpoint + 1; 
               
            } 
            
        }}else break;
        }
        
        for(int i=0;i<cost.length;i++){
            if(cost_sortbefore[i] == result_one){
                result_one = i + 1;
                cost_sortbefore[i] = 0;
                break;
            }
            
        }
      

        for(int i=0;i<cost.length;i++){
          
            if(cost_sortbefore[i] == result_two){
                result_two = i + 1;
            }
        }
        int temp=0;

        if(result_two<result_one){
            temp = result_two;
            result_two = result_one;
            result_one = temp;
        }
    
        System.out.println(result_one + " " + result_two);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
