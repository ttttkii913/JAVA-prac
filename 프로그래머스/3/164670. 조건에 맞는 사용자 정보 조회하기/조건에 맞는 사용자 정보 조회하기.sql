-- 코드를 입력하세요
SELECT u.user_id, u.nickname, CONCAT(u.city,' ', u.street_address1, ' ', u.street_address2) 전체주소,
CONCAT(SUBSTR(u.tlno,1,3),'-', SUBSTR(u.tlno,4,4), '-', SUBSTR(u.tlno,8,4)) 전화번호
FROM USED_GOODS_USER u
JOIN USED_GOODS_BOARD b
ON u.user_id = b.writer_id
GROUP BY u.user_id
HAVING COUNT(u.user_id) >= 3
ORDER BY u.user_id desc