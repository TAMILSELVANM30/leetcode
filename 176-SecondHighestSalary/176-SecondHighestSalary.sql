-- Last updated: 6/11/2026, 1:30:31 AM
SELECT IFNULL((SELECT MAX(SALARY) AS  SecondHighestSalary FROM Employee WHERE SALARY<(SELECT MAX(SALARY)  FROM Employee)),NULL) AS SecondHighestSalary;