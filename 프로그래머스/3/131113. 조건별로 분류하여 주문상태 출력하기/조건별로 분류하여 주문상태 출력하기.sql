-- 코드를 입력하세요
SELECT order_id, product_id, date_format(out_date,'%Y-%m-%d') out_date, IF(out_date <= '2022-05-01','출고완료', IF(out_date > '2022-05-01','출고대기','출고미정')) 출고여부
FROM food_order
ORDER BY order_id