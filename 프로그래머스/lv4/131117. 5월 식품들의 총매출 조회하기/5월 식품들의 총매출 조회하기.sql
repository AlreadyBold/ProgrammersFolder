-- 코드를 입력하세요
SELECT a.PRODUCT_ID, a.PRODUCT_NAME, sum((b.amount * a.price)) as TOTAL_SALES
FROM FOOD_PRODUCT a
inner join FOOD_ORDER b              
ON (a.PRODUCT_ID = b.PRODUCT_ID)     
WHERE TO_CHAR(b.PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY a.PRODUCT_ID, a.PRODUCT_NAME
order by TOTAL_SALES desc, PRODUCT_ID asc