-- Last updated: 7/11/2026, 3:57:56 PM
# Write your MySQL query statement below
SELECT e1.name as Employee from Employee e1 join Employee e2  ON  e2.id=e1.managerId 
where e1.Salary>e2.Salary;  
