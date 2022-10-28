--조건별로 분류하여 주문상태 출력하기

--Oracle코드
SELECT ORDER_ID, PRODUCT_ID, TO_CHAR(OUT_DATE, 'YYYY-MM-DD') OUT_DATE, 
    CASE WHEN TO_CHAR(OUT_DATE, 'MM-DD') <= '05-01' THEN '출고완료'
         WHEN TO_CHAR(OUT_DATE, 'MM-DD') > '05-01' THEN '출고대기'
         WHEN OUT_DATE IS NULL THEN '출고미정'
         END 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;



--MYSQL 코드
