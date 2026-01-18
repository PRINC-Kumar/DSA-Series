# Write your MySQL query statement below
DELETE P1
from person P1
JOIN  person p2 
ON p1.email=p2.email
AND p1.id>p2.id; 
