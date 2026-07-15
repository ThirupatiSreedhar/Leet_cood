# Write your MySQL query statement below
select s.product_id ,round(ifnull(sum(u.units*s.price)/sum(u.units),0),2) as average_price
from prices s left join unitssold u
on s.product_id = u.product_id 
and u.purchase_date between start_date and end_date
group by s.product_id;