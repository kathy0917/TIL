function solution(str){
                let answer = 0;

                /*정규표현식을 활용한 방법
                answer = str.replace(/[^0-9]/g,"");
                return parseInt(answer);*/

                /*isNan을 활용한 방법*/
                for(let s of str){
                    //숫자이면
                    if(!isNaN(s)){
                        answer = answer * 10 + Number(s);
                    } 
                }

                return answer;
            }
            
            let str="g0en2T0s8eSoft";
            console.log(solution(str));
