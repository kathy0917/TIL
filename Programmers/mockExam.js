function solution(answers) {
    let answer = [];
    let correct = [0,0,0];
    let a = [1,2,3,4,5];
    let b = [2,1,2,3,2,4,2,5,2,1];
    let c = [3,3,1,1,2,2,4,4,5,5];
    let max = 0;
    
    for(let i=0;i<answers.length;i++){
        if(a[i%5] === answers[i])correct[0]++;
        if(b[i%8] === answers[i])correct[1]++;
        if(c[i%10] === answers[i]) correct[2]++;
    }
    max = Math.max(correct[2],Math.max(correct[0],correct[1]));
    
    for(let i=0;i<correct.length;i++){
        if(max === correct[i]){
            answer.push(i+1);
        }
    }
    
    
    return answer;
}
