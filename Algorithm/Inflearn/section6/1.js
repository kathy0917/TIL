function solution(s){
                let answer="YES";
                let stack = [];
                for(let ele of s){
                    if(ele === "("){
                        stack.push(ele);
                    }else{
                        if(stack.length !== 0) stack.pop();
                        else return "NO"
                    }
                }
                if(stack.length >0) answer = "NO";
                return answer;
            }
            
            //let a="(()(()))(()";
            let a=")()";
            console.log(solution(a));
