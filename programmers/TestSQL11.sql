--재구매가 일어난 상품과 회원 리스트 구하기

--Oracle
SELECT 
    USER_ID, 
    PRODUCT_ID
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
having count(PRODUCT_ID) > 1
order by USER_ID, PRODUCT_ID desc;


--MySQL
