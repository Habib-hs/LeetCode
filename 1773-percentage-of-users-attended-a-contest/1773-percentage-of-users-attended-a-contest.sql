# Write your MySQL query statement below
Select r.contest_id as contest_id,
       Round(((Count(r.user_id)/(Select Count(user_id) from Users))*100), 2) as percentage
FROM Users u
Right Join Register r
On u.user_id = r.user_id
Group by r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;