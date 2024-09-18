-- 코드를 입력하세요
SELECT car_id,
IF(SUM(IF (start_date <= "2022-10-16" AND end_date >= "2022-10-16", 1, 0)), "대여중", "대여 가능") AVAILABILITY
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC