#include <stack>
#include <string>
#include <iostream>
using namespace std;

int main() {
	stack<char> st;
	stack<char> st2;
	int cur,n;
	char prompt, c;
	string str;
	
	cin>>str;	
	cin>>n;

	for(int i=0;i<str.length();i++){
		st.push(str[i]);
	}
	
	for(int i=0;i<n;i++){
		cin>>prompt;
		
		if(prompt =='P'){
			cin>>c;
			st.push(c);
			
		}else if(prompt == 'L'){
			if(!st.empty()){
				st2.push(st.top());
				st.pop();	
			}
			
		}else if(prompt == 'D'){
			if(!st2.empty()){
				st.push(st2.top());
				st2.pop();
			}
			
		}else if(prompt == 'B'){
			if(!st.empty()){
				st.pop();

			}
		}
	}
	
	while(!st.empty()){
		st2.push(st.top());
		st.pop();
	}
	
	while(!st2.empty()){
        cout<<st2.top();
		st2.pop();
	}
	
	
	return 0;
}
