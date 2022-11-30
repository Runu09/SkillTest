--카테고리 별 상품 개수 구하기

--Oracle
SELECT
    substr(product_code, 0, 2) product_code,
    count(product_id) PRODUCTS
FROM PRODUCT
group by substr(product_code, 0, 2)
order by product_code;


--MySQL
