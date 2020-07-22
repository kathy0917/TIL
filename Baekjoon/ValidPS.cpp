#include <stdio.h>
using namespace std;

int main() {
	char arr[51], n, result=0;
	
	scanf("%d", &n);
	
	//첫번째 line에서 받은 수 만큼 while문 반복 
	while(n--){
			scanf("%s", &arr);
		for(int i=0;arr[i]!='\0';i++){
				if(arr[i]=='('){
			result++;
		}else if(arr[i]==')'){
			result--;
		}
		if(result<0) break;
		}
		
		if(result==0){
		printf("YES\n");	
	}else printf("NO\n");
	
	result = 0;
	}
	

	return 0;
}
