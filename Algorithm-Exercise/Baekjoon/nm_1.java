import java.util.Scanner;

public class nm_1 {
    static boolean[] check = new boolean[10];
    static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        func(0,N,M);
    }

    static void func(int index, int n, int m){
        if(index == m){
            for(int i=0;i<m;i++){
                System.out.print(arr[i] + " ");
            
            }
            System.out.println();
            
        }
        for(int i=1;i<=n;i++){
            if(check[i]) continue;
            arr[index] = i;
            check[i] = true;
            func(index+1,n,m);
            check[i] = false;
        }
    }
    
}