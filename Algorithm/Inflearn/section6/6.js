function solution(n, k){
                let answer;
                let queue = [];

                /*let queue = Array.from({length:n},(value,index)=>index+1)*/
                for(let i=1;i<=n;i++){
                    queue.push(i);
                }

                while(queue.length>1){
                    for(let i=0;i<k;i++){
                        if(i=== k-1){
                            queue.shift();
                        }else{
                            queue.push(queue.shift());
                        }
                    }
                }
                answer = queue[0];
                return answer;
            }

            console.log(solution(8, 3));
