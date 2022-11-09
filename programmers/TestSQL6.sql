--보호소에서 중성화한 동물

--Oracle
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i, ANIMAL_OUTS o
where i.ANIMAL_ID=o.ANIMAL_ID
and i.SEX_UPON_INTAKE like 'Intact%'
and o.SEX_UPON_OUTCOME not like 'Intact%'
order by i.ANIMAL_ID;

--MySQL
