-- nome employees e del loro department
select first_name, last_name, department_name
from employees join departments
using (department_id);

-- nome degli employees e job title (da jobs)
select first_name, last_name, job_title
from employees join jobs
using (job_id);

-- nome degli employees che hanno il salario minimo o massimo previsto per il loro job title
select first_name, last_name, salary
from employees e join jobs j
using (job_id)
where (salary = MIN_SALARY) or (salary = MAX_SALARY);

-- nome degli employees basati in UK (join con locations, ma prima con departments)
select first_name, last_name, country_id
from employees join departments using (department_id)
join locations using (location_id)
where country_id = 'UK'; 

-- nome dei departments e manager associato
select department_name, first_name, last_name
from department d join employees e
on (d.manager_id = e.employee_id);

-- nome di ogni department e, se esiste, del relativo manager
select department_name, first_name, last_name
from departments d left outer join employees e
on (d.manager_id = e.employee_id);

-- nome dei department che non hanno un manager associato
select department_name, manager_id
from departments
where manager_id is null;

-- nome degli employees e del loro manager
select concat (e.first_name, ' ', e.last_name) as employee, concat (m.first_name, ' ', m.last_name) as manager
from employees e join employees m
on (m.employee_id = e.manager_id);