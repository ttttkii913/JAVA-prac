-- 코드를 작성해주세요
SELECT d.dept_id, d.dept_name_en, ROUND(AVG(sal), 0) AVG_SAL
FROM hr_department d
JOIN hr_employees e
USING(dept_id)
GROUP BY d.dept_id
ORDER BY AVG_SAL DESC