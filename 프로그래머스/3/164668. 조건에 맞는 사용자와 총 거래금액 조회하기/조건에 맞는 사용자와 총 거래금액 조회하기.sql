-- 코드를 입력하세요
SELECT u.user_id, u.nickname, SUM(b.price) TOTAL_SALES
FROM USED_GOODS_USER u
INNER JOIN USED_GOODS_BOARD b
ON u.user_id = b.writer_id
WHERE b.status = "DONE"
GROUP BY b.writer_id
HAVING SUM(b.price) >= 700000
ORDER BY SUM(b.price) asc