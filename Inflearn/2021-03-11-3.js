function solution(s, e){  
                let distance = Array.from({length: 10001 },()=>0);
                let ch = Array.from({length: 10001}, ()=>0);
                let queue = [];
                queue.push(s);
                ch[s] = 1;
                distance[s] = 0;

                while(queue.length>0){
                    let x = queue.shift();

                    for(let nx of [x-1, x+1, x+5]){
                        if(nx === e) return distance[x] + 1;
                        if(ch[nx] === 0 && nx > 0 && nx < 10001){
                            queue.push(nx);
                            ch[nx] = 1;
                            distance[nx] = distance[x]+1;
                        }
                    }
                }
            }

            console.log(solution(5, 14));
