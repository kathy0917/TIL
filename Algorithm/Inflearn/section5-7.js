function solution(str1, str2){
                let answer = "YES";

                let strMap = new Map();
                
                for(let ele of str1){
                    if(strMap.has(ele)){
                        strMap.set(ele, strMap.get(ele)+1);
                    }else strMap.set(ele,1);
                }
                for(let ele of str2){
                    if(!strMap.has(ele) || strMap.get(ele) === 0) return "NO";
                    strMap.set(ele,strMap.get(ele)-1); 
                }
                

                return answer;
            }
            
            let a="AbaAeCe";
            let b="baeeACA";
            console.log(solution(a, b));
