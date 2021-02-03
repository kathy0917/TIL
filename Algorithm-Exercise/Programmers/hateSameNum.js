function solution(arr)
{
    let answer = [];
    let before = 0;
    
    for(let i =1;i<arr.length;i++){
        if(arr[i-1] !== arr[i] ){
            answer.push(arr[i-1]);
        }
    }
    if(answer[answer.length-1] !== arr[arr.length-1]){
        answer.push(arr[arr.length-1]);
    }
    
    return answer;
}
