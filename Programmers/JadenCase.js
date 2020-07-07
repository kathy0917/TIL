function solution(s) {
    let answer = "";
    let first = 0;
    let k = "";
    first = s.charCodeAt(0);
    if(first>=97||first<=122){
        first = s.charAt(0).toUpperCase();
    }
    answer = first;
    for(let i =1;i<s.length;i++){
        if(s.charAt(i-1) === " "){
            if(s.charCodeAt(i)>=97||s.charCodeAt(i)<=122){
                k = s.charAt(i).toUpperCase();
                answer +=k;
            }
        }else if(s.charCodeAt(i)>=65 || s.charCodeAt(i)<=90){
            k = s.charAt(i).toLowerCase();
            answer += k;
        }else answer += s[i];
    }     
       
    return answer;
}
