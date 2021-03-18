function solution(c, arr){
                let answer=Number.MIN_SAFE_INTEGER; 
                //JavaScript에서 안전한 최소 정수값을 나타냅니다. (-(253 - 1))
                let n=arr.length;
                function DFS(L, sum){
                    if(sum>c) return; //탈출조건
                    if(L === n){
                        answer = Math.max(answer, sum);
                        
                    }else{
                        DFS(L+1, sum+arr[L]); //선택한다.
                        DFS(L+1, sum); //선택하지 않는다.
                    }
                }
                DFS(0, 0);
                return answer;
            }

            let arr=[81, 58, 42, 33, 61];
            console.log(solution(259, arr));
