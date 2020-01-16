-- S46
-- Salary: maggiore, minore, somma, media
select max(salary), min(salary), sum(salary), avg(salary)
from employees;

-- Come sopra, ma per ogni job_id
select max(salary), min(salary), sum(salary), avg(salary)
from employees
group by job_id;

-- Quanti dipendenti per ogni job_id
select job_id, count(employee_id)
from employees
group by job_id;

-- Quanti sono gli IT_PROG
select job_id, count(employee_id)
from employees
where job_id = 'IT_PROG';

-- Quanti sono i manager
select count(distinct manager_id)
from employees;

-- Nome dei dipendenti che non sono manager
select first_name, last_name 
from employees
where employee_id not in (
select distinct manager_id
from employees where manager_id is not null);


-- Qual è la differenza tra il salario maggiore e il minore
select max(salary), min(salary), (max(salary)- min(salary)) as difference
from employees;

-- Qual è la differenza tra il salario maggiore e il minore ma per ogni job_id, non considerando dove non c’è differenza
select max(salary), min(salary), (max(salary)- min(salary)) as difference
from employees
group by job_id
having min(salary)!=max(salary);

-- Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select first_name, last_name, min(salary)
from employees
where manager_id is not null
group by manager_id
having min(salary) >= 6000;

-- S47
-- indirizzi completi, tra locations e countries
select street_address, country_name
from locations join countries 
using (country_id);

-- nome di tutti i dipendenti e nome del loro department
select first_name, last_name, department_name 
from employees join departments
using (department_id);

-- Come sopra, ma solo per chi è basato a Toronto
select first_name, last_name, department_name, city 
from employees join departments using (department_id)
join locations using (location_id)
where city = 'Toronto';

-- chi è stato assunto dopo David Lee
select count(employee_id)
from employees
where first_name='David' and last_name='Lee';

select first_name, last_name, hire_date
from employees
where hire_date > (select hire_date from employees where first_name = 'David' and last_name = 'Lee');

-- – Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name, e.hire_date
from employees e join employees m
on (e.manager_id= m.employee_id) 
where e.hire_date < m.hire_date;

-- Chi ha lo stesso manager di Lisa Ozer
select first_name, last_name, manager_id
from employees
where manager_id in (select manager_id from employees where first_name = 'Lisa' and last_name = 'Ozer');

-- Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select first_name, last_name, department_name
from employees join departments
using (department_id)
where department_id in (select distinct department_id from employees where last_name like '%u%');

-- chi lavora nel department shipping
select first_name, last_name, department_name
from employees join departments
using (department_id)
where department_name = 'shipping';

-- chi ha come manager stephen king
select first_name, last_name 
from employees
where manager_id in (select employee_id from employees where first_name = 'steven' and last_name = 'king');

