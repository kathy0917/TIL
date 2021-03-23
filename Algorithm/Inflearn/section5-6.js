function solution(s){  
                let answer;
                let map = new Map();

                for(let x of s){
                    if(map.has(x)){
                        map.set(x,map.get(x)+1);
                    }else map.set(x,1);
                }

                let max = Math.max(...map.values());
                for(let [key] of map){
                    if(map.get(key) === max) answer = key;
                }
                
                /*
                let max = Number.MIN_SAFE_INTEGER;
                for(let [key,val] of map){
                    if(val>max){
                        max = val;
                        answer = key;
                    }
                }
                */
                return answer;
            }

            let str="BACBACCACCBDEDE";
            console.log(solution(str));
