-- 코드를 작성해주세요
SELECT i.id, n.fish_name, i.length LENGTH
FROM fish_info i
JOIN fish_name_info n
USING(fish_type)
WHERE fish_type IN
(
    SELECT fish_type
    FROM fish_info 
    GROUP BY fish_type
    HAVING LENGTH = MAX(LENGTH)
)
ORDER BY id ASC