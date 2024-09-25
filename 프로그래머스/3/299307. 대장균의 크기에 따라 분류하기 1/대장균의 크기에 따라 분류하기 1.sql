-- 코드를 작성해주세요
SELECT id, IF(size_of_colony<= 100, 'LOW', IF(size_of_colony<= 1000, 'MEDIUM', 'HIGH')) SIZE
FROM ecoli_data
ORDER BY id ASC