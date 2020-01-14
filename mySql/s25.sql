-- self join
select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);

-- "classic" self join
select e.first_name as 'e name' , e.last_name as employee, m.first_name as 'm name', m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;

select concat(e.first_name, ' ', e.last_name) as employee , concat(m.first_name, ' ',  m.last_name) as manager, e.hire_date 
from employees e, employees m
where e.manager_id = m.employee_id
order by e.hire_date asc;
