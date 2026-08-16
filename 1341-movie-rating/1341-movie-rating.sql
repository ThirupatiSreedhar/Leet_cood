select results
from (
    select u.name as results
    from users u
    join movierating m
    on u.user_id = m.user_id
    group by u.user_id, u.name
    order by count(*) desc, u.name
    limit 1
) a

union all

select results
from (
    select mo.title as results
    from movies mo
    join movierating m
    on mo.movie_id = m.movie_id
    where m.created_at >= '2020-02-01'
    and m.created_at < '2020-03-01'
    group by mo.movie_id, mo.title
    order by avg(m.rating) desc, mo.title
    limit 1
) b;