# Write your MySQL query statement below
SELECT c.name AS customers
FROM customers c
WHERE NOT EXISTS(
    SELECT 1
    
    FROM Orders o
    WHERE  c.id=o.customerId
);
