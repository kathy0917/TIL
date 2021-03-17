<html>
    <head>
        <meta charset="UTF-8">
        <title>출력결과</title>
    </head>
    <body>
        <script>
            function solution(s){
                let answer="YES";
                let LowerS = s.toLowerCase();
                
                // /*방법1*/
                // for(let i=0;i<Math.floor(s.length/2);i++){
                //     if(LowerS[i] !== LowerS[s.length-i-1]) return "NO";
                // }

                /*방법2*/
                if(LowerS.split("").reverse().join("") !== LowerS) return "NO";
                
                return answer;
            }
            
            let str="goooG";
            console.log(solution(str));
        </script>
    </body>
</html>

