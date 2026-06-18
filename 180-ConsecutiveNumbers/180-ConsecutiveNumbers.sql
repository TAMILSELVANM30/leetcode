-- Last updated: 6/18/2026, 10:24:20 AM
select distinct num as ConsecutiveNums from ( 
    select
 num , 
LAG(num) over(order by id) AS PREV_COL ,
lead(num) over(order by id ) AS NEXT_COL 
from Logs
) as ConsecutiveNums 
 WHERE PREV_COL=NUM AND NEXT_COL=NUM  ;