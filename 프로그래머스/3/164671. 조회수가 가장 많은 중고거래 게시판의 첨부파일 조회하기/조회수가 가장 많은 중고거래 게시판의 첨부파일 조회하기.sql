-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', board_id, '/', file_id, file_name, file_ext) FILE_PATH
FROM USED_GOODS_BOARD b 
JOIN USED_GOODS_FILE f
USING(board_id)
WHERE views = 
(
    SELECT MAX(views)
    FROM USED_GOODS_BOARD
)
ORDER BY file_id DESC