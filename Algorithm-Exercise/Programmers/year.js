function solution(a, b) {
    let answer = 0;
    const day = [31,29,31,30,31,30,31,31,30,31,30,31];
    const week = ['FRI','SAT','SUN','MON','TUE','WED','THU'];
    
    for(let i=0;i<a-1;i++){
        answer += day[i];
    }
    
    answer += b-1;
    answer = week[answer%7];
    
    
    return answer;
}
