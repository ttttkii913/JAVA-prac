-- 코드를 입력하세요
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, ROUND(AVG(r.review_score),2) SCORE
FROM rest_info i
JOIN rest_review r
USING (rest_id)
WHERE i.address LIKE '서울%'
GROUP BY rest_id
ORDER BY SCORE DESC , favorites DESC