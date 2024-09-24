-- 코드를 작성해주세요
SELECT COUNT(*) FISH_COUNT, MAX(length) MAX_LENGTH, fish_type
FROM fish_info f
GROUP BY fish_type
HAVING AVG(IFNULL(length, 10)) >= 33
ORDER BY fish_type ASC