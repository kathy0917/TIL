function solution(){  
                let answer = " ";
                let queue = [];
                queue.push(1);

                while(queue.length>0){
                    let v = queue.shift();
                    answer += `${v} `;
                    
                    // for(let nv of [v*2, v*2+1]){ 
                    //     if(nv>7) continue;
                    //     queue.push(nv);
                    // }
                    if(v*2 <= 7) queue.push(v*2);
                    if(v*2+1 <= 7) queue.push(v*2+1);
                        
                    
                }
                return answer;
            }

            console.log(solution());
