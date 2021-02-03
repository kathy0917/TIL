function solution(citations) {
    let answer = 0;
    let idx = 0;
    citations.sort((a,b)=>b-a);
    
    while(idx+1<=citations[idx]){
        answer = idx+1;
        idx++;
    }
    return answer;
}
