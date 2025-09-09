# Write your MySQL query statement below
SELECT e.name,b.unique_id FROM Employees e LEFT JOIN EmployeeUNI B ON e.id=b.id;