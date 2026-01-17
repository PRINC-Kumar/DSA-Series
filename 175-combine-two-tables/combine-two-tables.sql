# Write your MySQL query statement below
SELECT firstName,LastName,city,state
from Person P
LEFT JOIN Address A
ON P.personId=A.personId;