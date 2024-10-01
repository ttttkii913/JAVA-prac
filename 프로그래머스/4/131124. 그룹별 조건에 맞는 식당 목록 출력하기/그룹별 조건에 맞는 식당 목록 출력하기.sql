-- 코드를 입력하세요
SELECT m.member_name, r.review_text, DATE_FORMAT(r.review_date, '%Y-%m-%d')
FROM rest_review r
JOIN member_profile m
USING(member_id)
WHERE m.MEMBER_ID = (
    SELECT member_id
    FROM rest_review
    GROUP BY member_id
    ORDER BY count(*) desc
    LIMIT 1
)
ORDER BY 3, 2