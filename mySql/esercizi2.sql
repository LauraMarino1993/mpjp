select first_name, last_name, hire_date 
from employees
where hire_date like '2005-%%-%%'; -- oppure where hire_date between 2005-01-01 and 2005-12-31

select distinct job_id
from employees
order by job_id asc;

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select first_name, last_name
from employees
where first_name or last_name like '%a%';

select distinct department_name
from departments
order by department_name asc;

select distinct street_address
from locations
where country_id = 'IT';

select first_name, last_name, hire_date
from employees
where last_name like 'mc%' 
order by hire_date desc;

select first_name, last_name, hire_date
from employees
where last_name or first_name like '_h%' 
order by hire_date desc;

