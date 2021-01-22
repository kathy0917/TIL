function solution(numbers) {
     let answer = numbers.sort((a,b)=>(`${b}`+`${a}`)-(`${a}`+`${b}`));
     answer = answer[0] === 0 ? "0" : answer.join("");
    
    return answer;
}
