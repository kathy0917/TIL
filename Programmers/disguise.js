function solution(clothes) {
    let answer = 1;
        
    let clothesMap = new Map();
    let count=0;

     
    for(let cloth of clothes){
        if(!clothesMap.get(cloth[1])){
            clothesMap.set(cloth[1],1);    
        }else{
            count = clothesMap.get(cloth[1]);
            count += 1;
            clothesMap.set(cloth[1],count);
            count = 0;
        }
    }
     
    for(let ele of clothesMap.values()){
        answer = (ele+1) * answer;
    }
    answer -= 1;
    
    return answer;
}
