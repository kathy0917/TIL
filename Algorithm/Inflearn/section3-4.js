function solution(s, t){
                let answer=[];
                let count = 0;
                
                /*시간 복잡도 O(n)*/
                for(let ele of s){
                    if(ele === t){
                        count = 0;
                        answer.push(0);
                    }else{
                        count++;
                        answer.push(count); 
                    }
                }

                count = 1000;

                for(let ele=s.length;ele>0;ele--){
                    if(s[ele-1] === t){
                        count = 0;
                        answer[ele-1] = count;
                    }else{
                        count++;
                        answer[ele-1] = Math.min(count, answer[ele-1]);
                        
                    }
                }

                return answer;
            }
            
            let str="teachermode";
            console.log(solution(str, 'e'));
