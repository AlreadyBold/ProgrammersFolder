SELECT  ANIMAL_ID, NAME FROM (SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A
INNER JOIN ANIMAL_OUTS B 
ON (A.ANIMAL_ID = B.ANIMAL_ID)
ORDER BY (B.DATETIME - A.DATETIME) desc) WHERE ROWNUM < 3 ;