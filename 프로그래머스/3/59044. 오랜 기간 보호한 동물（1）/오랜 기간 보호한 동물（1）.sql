-- 코드를 입력하세요
SELECT ai.name, ai.datetime
FROM animal_ins ai
LEFT JOIN animal_outs ao 
ON ai.animal_id = ao.animal_id
WHERE ao.animal_id is null
ORDER BY ai.datetime limit 3