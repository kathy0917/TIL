package easy;

import java.util.Scanner;

public class ValidPs {
   

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      char plus = '(';
      char minus = ')';
      String n = null; //����ڷκ��� �Է¹޴� ��ȣ
      char n2 = 0;//�Է¹��� ������ ��ȣ 
      int k = 0;//-1,+1 ���� 
      
      char[] first = {0,0,0,0,0,0,0,0,0,0};
      
      int[] sum ={0,0,0,0,0,0,0,0,0,0}; 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      
      /*for(int i=0;i<a;i++){
         n=sc.next();
         for(int j=0;j<n.length();j++){
             n2 = n.charAt(j);
             if(n2 == plus){ 
               	sum[i]++;
            } else if(n2 == minus){
            	sum[i]--;}
            else return;
         }
            }
      */
      for(int i=0;i<a;i++){
          n=sc.next();
          
          for(int j=0;j<n.length();j++){
              n2 = n.charAt(j);
              if(n.charAt(0)==')') {
            	  first[i]=')';
                  break;
                }
             
              if(n2 == plus){ 
                	sum[i]++;
             } else if(n2 == minus){
             	sum[i]--;
             }
              else return;}
          
              }
     
   
      
      for(int i=0;i<a;i++){
      if((sum[i] == 0)&&(first[i]!=')')){
         System.out.println("YES");
      } else System.out.println("NO");
   }
}
}