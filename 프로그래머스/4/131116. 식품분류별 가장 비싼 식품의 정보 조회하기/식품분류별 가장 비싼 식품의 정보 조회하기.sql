-- 코드를 입력하세요
SELECT category, price, product_name
FROM FOOD_PRODUCT  
WHERE category IN ('과자','국','김치','식용유')
AND price IN (
SELECT MAX(price)
    FROM FOOD_PRODUCT
    GROUP BY category
)
GROUP BY 1
ORDER BY 2 DESC