-- Last updated: 6/18/2026, 10:24:18 AM
select Email from Person group by email HAVING count(*)>=2  ;