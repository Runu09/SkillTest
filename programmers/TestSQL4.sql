--주문량이 많은 아이스크림들 조회하기

--Oracle
SELECT FLAVOR
from (
    SELECT f.FLAVOR, SUM(f.TOTAL_ORDER+j.TOTAL_ORDER) AS TOTAL
    from FIRST_HALF f, JULY j
    where f.FLAVOR = j.FLAVOR
    group by f.FLAVOR
    order by SUM(f.TOTAL_ORDER+j.TOTAL_ORDER) desc
)
where rownum <= 3;

--MySQL
