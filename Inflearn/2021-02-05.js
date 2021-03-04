<html>
    <head>
        <meta charset="UTF-8">
        <title>[ps]2021-02-05</title>
    </head>
    <body>
        <script>
            function solution(n, m){
                let answer=[];
                let tmp=Array.from({length:m}, ()=>0);
                function DFS(L){
                    if(L===m){
                        answer.push(tmp.slice());
                    }
                    else{
                        for(let i=1; i<=n; i++){
                            tmp[L]=i;
                            DFS(L+1);
                        }
                    }   
                }
                
                DFS(0);
                return answer;
            }

            console.log(solution(3, 2));
        </script>
    </body>
</html>
