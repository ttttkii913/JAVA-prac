-- 코드를 입력하세요
SELECT product_id, product_name, SUM(p.price * o.amount) TOTAL_SALES
FROM FOOD_PRODUCT p
JOIN FOOD_ORDER o
USING (product_id)
WHERE o.produce_date LIKE "2022-05%"
GROUP BY p.product_id
ORDER BY total_sales DESC, product_id ASC
