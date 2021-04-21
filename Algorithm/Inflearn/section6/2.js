function solution(s){  
                let answer;
                let stack = [];
                let x = "";
                for(ele of s){
                    if(ele !== ")") stack.push(ele);
                    else{
                        while(stack.pop() !=="(");
                    }    
                }
                answer = stack.join("");
                return answer;
            }

            let str="(A(BC)D)EF(G(H)(IJ)K)LM(N)";
            console.log(solution(str));
