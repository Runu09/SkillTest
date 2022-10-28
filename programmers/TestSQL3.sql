--오랜 기간 보호한 동물(2)

--Oracle 코드
select ANIMAL_ID, NAME
from(
    SELECT (ao.DATETIME - ai.DATETIME) a, ai.ANIMAL_ID, ai.NAME
    FROM ANIMAL_INS ai, ANIMAL_OUTS ao
    where (ai.ANIMAL_ID = ao.ANIMAL_ID)
    order by a  desc
)
where rownum < 3;



--MYSQL 코드
