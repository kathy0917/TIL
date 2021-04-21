function solution(n, k, card){
                let answer;
                let sumArr = [];
                let sum = 0;
                //let tmp = new Set();

                for(let i=0;i<n;i++){
                    for(let j=i+1;j<n;j++){
                        for(let m=j+1;m<n;m++){
                            /*
                                tmp.add(card[i]+card[j]+card[m]);
                            */
                            sum += card[i];
                            sum += card[j];
                            sum += card[m];
                            sumArr.push(sum);
                            sum = 0;
                        }
                    }
                   
                }
                //let a = Array.from(tmp).sort((a,b)=>b-a);
                
                sumArr.sort((a,b)=>{
                    return b-a;
                });

                answer = sumArr[k-1];
                return answer;
            }
            
            let arr=[13, 15, 34, 23, 45, 65, 33, 11, 26, 42];
            console.log(solution(10, 3, arr));
