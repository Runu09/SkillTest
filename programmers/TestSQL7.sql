--오랜 기간 보호한 동물(1)

--Oracle
SELECT NAME, DATETIME
from (
    SELECT i.NAME, i.DATETIME
    from ANIMAL_INS i
    left join ANIMAL_OUTS o
    on i.ANIMAL_ID=o.ANIMAL_ID
    where o.datetime is null
    order by i.datetime
)
where rownum <= 3;

--MySQL
