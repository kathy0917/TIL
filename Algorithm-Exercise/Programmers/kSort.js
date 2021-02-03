function solution(array, commands) {
    let answer = [];
    let arr2 = [];
    
    for(let m = 0;m<commands.length;m++){
        let i = commands[m][0];
        let j = commands[m][1];
        let k = commands[m][2];
        
        for(let n = 0;n<array.length;n++){
            if(n==i-1){
                for(let l=0;l<=j-i;l++){
                    arr2.push(array[n]);
                    n++;
                }
                break;
            }
        }
        arr2.sort(function(v1, v2){return v1-v2;});
        answer.push(arr2[k-1]);
        arr2 = [];
    }
    
    
    return answer;
}
