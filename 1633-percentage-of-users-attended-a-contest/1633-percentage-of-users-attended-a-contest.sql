# Write your MySQL query statement below
#elect r.contest_id ((u.user_id/r.user.id)*100) as percentage
#3from users u left join register r 
#on u.user_id = r.user_id 
#group by r.contest_id;
select
    r.contest_id,
    round(count(r.user_id) * 100.0 / (select count(*) from users), 2) as percentage
from register r
group by r.contest_id
order by percentage desc, r.contest_id;
