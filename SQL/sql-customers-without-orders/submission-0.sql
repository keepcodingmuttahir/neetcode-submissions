-- Write your query below
Select c.name 
from customers c
LEFT join orders o
on c.id = o.customer_id
where o.customer_id IS NULL;