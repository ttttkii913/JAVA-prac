-- 코드를 입력하세요
SELECT MONTH(start_date) MONTH, car_id, COUNT(*) RECORDS
FROM car_rental_company_rental_history
WHERE MONTH(start_date) BETWEEN 8 AND 10
AND car_id IN 
(
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE MONTH(start_date) BETWEEN 8 AND 10
    GROUP BY car_id
    HAVING COUNT(*) > 4
)
GROUP BY car_id, MONTH(start_date)
ORDER BY MONTH ASC, car_id DESC