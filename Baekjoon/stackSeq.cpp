#include <stdio.h>
#include <queue>
#include <stack>
using namespace std;

int main() {
	int n,k,num=1;
	
	queue<int> qu;
	queue<char> answer;
	stack<int> st;
	
	scanf("%d", &n);
	
    for(int i=0;i<n;i++){
		scanf("%d", &k);
		qu.push(k);
	}
		
	while(!qu.empty()){
		
		if(st.size()==0){
			st.push(num);
			num++;
			answer.push('+');
		}
		
		if(st.top() == qu.front()){
			answer.push('-');
			st.pop();
			qu.pop();
		}else if(st.top()<qu.front()){
			answer.push('+');
			st.push(num);
			num++;
		}else if(st.top()>qu.front()){
			printf("NO\n");
			return 0;
		}
		
	}
	
		while(!answer.empty()){
		printf("%c\n",answer.front());
		answer.pop();
	    }
	
	

	return 0;
}
