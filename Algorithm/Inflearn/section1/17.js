function solution(s){
            let answer;
            
            answer = Array.from(new Set(s));
            
            return answer;
        }
        let str = ["good","time","good","time","student"];
        console.log(solution(str))
