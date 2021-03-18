function solution(s){
                let answer="YES";
                let regExpS = s.toLowerCase().replace(/[^a-z]/g,'');

                if(regExpS.split("").reverse().join("") !== regExpS) return "NO";

                return answer;
            }
            
            let str="found7, time: study; Yduts; emit, 7Dnuof";
            console.log(solution(str));
