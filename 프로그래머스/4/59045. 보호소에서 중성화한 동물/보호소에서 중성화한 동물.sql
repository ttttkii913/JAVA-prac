-- 코드를 입력하세요
SELECT ai.animal_id, ai.animal_type, ai.name
FROM animal_ins ai
JOIN animal_outs ao
USING(animal_id)
WHERE ai.sex_upon_intake != ao.sex_upon_outcome
ORDER BY ai.animal_id