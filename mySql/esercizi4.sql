-- Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto
select first_name, last_name, round(salary), round(salary + (salary/100 * 8.5)) as salary_percent, truncate ((salary/100 *8.5),2) as delta
from employees;


-- Quanti giorni sono passati dall’assunzione a oggi
select datediff(curdate(), hire_date)
from employees;

-- Quant’è la commissione di ognuno o ‘no value’
select last_name, ifnull(commission_pct, 'no value')
from employees;

