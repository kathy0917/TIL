package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] P = new int[N];
		int min = 0;
		
		for(int i=0;i<P.length;i++) {
			P[i] = sc.nextInt();
		}
		Arrays.sort(P);
		
		for(int j=1;j<N;j++) {
			P[j] = P[j-1] + P[j];
			min = min + P[j];
		}
		System.out.println(min);
	}

}
