select first_name, last_name, email, phone_number, hire_date 
from employees
order by last_name asc, first_name asc; -- order by (2,1)

select first_name, last_name 
from employees 
where first_name = 'David' or first_name = 'Peter';

select first_name, last_name, department_id
from employees
where department_id = 60; 

select first_name, last_name, department_id
from employees
where department_id in (30,50);

select first_name, last_name, employee_id, salary
from employees
where salary>10000;

select first_name, last_name, employee_id, salary
from employees
where salary<4000 or salary>15000;

select first_name, last_name, employee_id, salary
from employees
where (salary<4000 or salary>10000) and department_id in (50,80);
