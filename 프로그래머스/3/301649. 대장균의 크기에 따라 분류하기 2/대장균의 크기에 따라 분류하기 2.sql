SELECT id, CASE
        WHEN ntile(4) OVER(ORDER BY size_of_colony DESC) = 1 THEN 'CRITICAL'
        WHEN ntile(4) OVER(ORDER BY size_of_colony DESC) = 2 THEN 'HIGH'
        WHEN ntile(4) OVER(ORDER BY size_of_colony DESC) = 3 THEN 'MEDIUM'
        WHEN ntile(4) OVER(ORDER BY size_of_colony DESC) = 4 THEN 'LOW'
    END COLONY_NAME
FROM 
    ECOLI_DATA
ORDER BY id ASC