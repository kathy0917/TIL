package baekjoon;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] input_char = new char[100];//�Է°� char�� 
		int[] arr = new int[26]; //���ĺ� ��� �迭
		int a;
		
		for(int i=0;i<input.length();i++){
			/*
			 *  ���ڿ� char������ 97�� ���� 012345~ �� �ƽ�Ű�ڵ尡 ǥ��ǹǷ� 
			 *  �ش� arr�迭 �� ������Ű�� 
			 */	
			input_char[i] = input.charAt(i);
			a = input_char[i]-97; //�ش� �ҹ����� �ƽ�Ű�ڵ尪���� 97(a)�� ����
			arr[a]++;
		}
		//��� �� ����ϱ� 
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		
	}
}