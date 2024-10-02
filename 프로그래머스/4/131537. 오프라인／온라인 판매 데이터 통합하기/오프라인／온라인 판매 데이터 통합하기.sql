-- 코드를 입력하세요
SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') SALES_DATE, product_id, user_id, sales_amount
FROM ONLINE_SALE
WHERE DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-03'

UNION

SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') SALES_DATE, product_id, NULL AS user_id, sales_amount
FROM OFFLINE_SALE
WHERE DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-03'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID