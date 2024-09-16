-- 코드를 입력하세요
SELECT ao.animal_id, ao.name
FROM animal_outs ao
JOIN animal_ins ai ON ao.animal_id = ai.animal_id
ORDER BY DATEDIFF(ao.datetime, ai.datetime) desc limit 2