-- Last updated: 8/8/2026, 9:52:05 PM
SELECT name AS Customers
FROM  Customers c
left JOIN Orders o
on c.id=o.customerId 
where o.customerId is null; 