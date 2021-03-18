function solution(s){
                let answer="";
                let count = 1;
                s += " ";

                //s에 공백을 추가했으므로 공백 제외한 길이만큼 돌아야함.
                for(let i=0;i<s.length-1;i++){
                    if(s[i] === s[i+1]){
                        count++;

                    }else{
                        answer += s[i];
                        if(count!==1) answer += String(count);
                        count = 1;
                    }
                }
                return answer;
            }
            
            let str="KKHSSSSSSSE";
            console.log(solution(str));
