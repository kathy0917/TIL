function solution(s) {
    let answer = '';
    let begin = s;
    
    if(s.length%2===1){
      begin = Math.floor(s.length/2);
      answer = s.slice(begin,begin+1);
    
    }else if(s.length%2===0){
      begin = Math.floor(s.length/2-1);
      answer = s.slice(begin,begin+2);
    }
    
    return answer;
}
