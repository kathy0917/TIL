package baekjoon;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] input_char = new char[100];//입력값 char값 
		int[] arr = new int[26]; //알파벳 담는 배열
		int a;
		
		for(int i=0;i<input.length();i++){
			/*
			 *  문자열 char값에서 97을 빼면 012345~ 로 아스키코드가 표기되므로 
			 *  해당 arr배열 값 증가시키기 
			 */	
			input_char[i] = input.charAt(i);
			a = input_char[i]-97; //해당 소문자의 아스키코드값에서 97(a)을 뺀값
			arr[a]++;
		}
		//결과 값 출력하기 
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		
	}
}