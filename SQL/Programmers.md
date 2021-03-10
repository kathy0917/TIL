<h1>[SQL] Prgrammers 고득점 Kit 문제풀이</h1>

*아래 링크를 참고하였습니다.<br>
(https://programmers.co.kr/learn/challenges?tab=sql_practice_kit) <br><br>

1. 최댓값 구하기
```sql
SELECT MAX(DATETIME) AS '시간'
FROM ANIMAL_INS
```

2. 모든 레코드 조회하기
```sql
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
```

3. 역순 정렬하기
```sql
SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESCy
```

4. 아픈 동물 찾기(where 조건)
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID;
```

5. 어린 동물 찾기(where not 조건)
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NOT INTAKE_CONDITION = 'Aged'
ORDER BY ANIMAL_ID;
```

6. 동물의 아이디와 이름
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
```

7. 이름이 없는 동물의 아이디(IS NULL)
```sql
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;
```

8. 상위 N개 레코드(서브쿼리문, LIMIT)
```sql
SELECT NAME
FROM ANIMAL_INS
WHERE DATETIME = (
    SELECT MIN(DATETIME)
    FROM ANIMAL_INS
    ORDER BY ANIMAL_ID)
```

```sql
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1

/*MySQL의 경우 : NAME 값을 조회하는데 가장 맨 위 행 1개만을 조회하기 위해 LIMIT 구문을 사용해야 합니다.
LIMIT 1 : 맨 위에서부터 1개까지의 정보 조회
LIMIT 3 : 맨 위에서부터 3개까지의 정보 조회
LIMIT 2, 6 : 위에서 2번째부터 6번째까지의 정보 조회
https://chanhuiseok.github.io/posts/db-3/
*/
```

9. 여러 기준으로 정렬하기(DESC, ASC)
```sql
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC ,DATETIME DESC;
```

10. 이름이 있는 동물의 아이디(IS NOT NULL)
```sql
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
```

11. 동물 수 구하기(count)
```sql
SELECT COUNT(*) AS count
FROM ANIMAL_INS
```

12. 중복 제거하기(DISTINCT)
```sql
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
```

13. 고양이와 개는 몇마리 있을까(GROUP BY)
```sql
SELECT ANIMAL_TYPE, COUNT(*) AS count
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE
```

14. null처리하기(IFNULL)
```sql
SELECT ANIMAL_TYPE, IFNULL(NAME,'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS
```

15. 동명 동물 수 찾기(HAVING BY)
```sql
SELECT NAME, COUNT(*) AS count
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME)>=2
ORDER BY NAME ASC
```

16.  입양 시각 구하기(HOUR)
```sql
SELECT HOUR(DATETIME) HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR(DATETIME)
HAVING HOUR >=9 AND HOUR <20
ORDER BY HOUR
```


17. 루시와 엘라 찾기(문자열)
```sql
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE SEX_UPON_INTAKE LIKE 'S%'
AND NAME IN('Lucy','Ella','Pickle','Rogan','Sabrina','Mitty');

/*in과 like 구분잘하기!! 
in은 or와 같은 조건이고, like는 해당 문자로 시작하는 문자열 비교할 때 사용,
*/
```

18. 이름에 el이 들어가는 동물 이름찾기(문자열)
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NAME LIKE ('%el%') AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;
```

19. 중성화 여부 파악하기
<a href="https://aorica.tistory.com/87">(CASE구문-삼항연산자 참고)</a>
```sql
SELECT ANIMAL_ID, NAME,
CASE
WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE 'S%'
THEN 'O'
ELSE 'X'
END AS 중성화
FROM ANIMAL_INS
```

20. DATETIME에서 DATE로 형 변환
```sql
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME,'%Y-%m-%d') AS 날짜
FROM ANIMAL_INS
```

21. 없어진 기록 찾기

```sql
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_OUTS AS A
LEFT OUTER JOIN ANIMAL_INS AS B
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL
ORDER BY B.ANIMAL_ID

/*https://chanhuiseok.github.io/posts/db-7/
https://futurists.tistory.com/17
https://yoo-hyeok.tistory.com/98*/
```
