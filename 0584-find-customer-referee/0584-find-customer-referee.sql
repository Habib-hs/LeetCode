# Write your MySQL query statement below
# SELECT name FROM Customer
# WHERE referee_id != 2 or referee_id is null ;

# Write another MySQL query 
SELECT name 
FROM Customer
WHERE COALESCE(referee_id, 0) != 2; # COALESCE will replace the NULL with 0 