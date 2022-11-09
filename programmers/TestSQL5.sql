--있었는데요 없었습니다

--Oracle
SELECT i.ANIMAL_ID, i.NAME
from ANIMAL_INS i, ANIMAL_OUTS o
where i.ANIMAL_ID = o.ANIMAL_ID
and i.datetime > o.datetime
order by i.datetime;

--MySQL
