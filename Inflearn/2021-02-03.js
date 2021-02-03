<html>
    <head>
        <meta charset="UTF-8">
        <title>[PS]2021-02-03</title>
    </head>
    <body>
        <script>
            function solution(c, arr){
                let answer=Number.MIN_SAFE_INTEGER; 
                //JavaScript에서 안전한 최소 정수값을 나타냄. (-(253 - 1))
                
                let n=arr.length;
                
                function DFS(L, sum){
                    if(sum>c) return; //탈출조건
                    if(L === n){
                        answer = Math.max(answer, sum);
                        
                    }else{
                        DFS(L+1, sum+arr[L]); 
                        DFS(L+1, sum); 
                    }
                }
                DFS(0, 0);
                return answer;
            }

            let arr=[81, 58, 42, 33, 61]; //입력값 
            console.log(solution(259, arr)); //출력값
        </script>
    </body>
</html>
