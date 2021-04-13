function isPrimeNum(num){
                    for(let i=2;i<parseInt(Math.sqrt(num));i++){
                        if(num%i===0) return false;
                    }
                return true;
            }

            function solution(arr){
                let answer=[];
                let reverse = 0;

                for(let ele of arr){
                    reverse = parseInt(String(ele).split("").reverse("").join(""),10);    
                    /* reverse를 함수를 사용하지 않고 하는 법
                    while(ele){
                        let t = ele%10;
                        result = result*10 + t;
                        ele = parsetInt(ele/10);
                    }
                    */


                    console.log(`ele ${ele} reverse ${reverse}`)
                    if(reverse >1 && isPrimeNum(reverse)===true){
                        answer += `${reverse} `;
                    }
                }

                return answer;
            }
            
            let arr=[32, 55, 62, 20, 250, 370, 200, 30, 100];
            console.log(solution(arr));
