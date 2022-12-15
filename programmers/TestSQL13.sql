--카테고리 별 도서 판매량 집계하기

--Oracle
SELECT b.CATEGORY, SUM(bs.SALES) as TOTAL_SALES 
from BOOK b
    inner join BOOK_SALES bs
    on (b.BOOK_ID = bs.BOOK_ID)
where to_char(SALES_DATE, 'yyyy-MM') = '2022-01'
group by b.CATEGORY
order by b.CATEGORY;


--MySQL
