-- create table by select
create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60;

-- when in doubt, do not run this one
-- drop table coders;

-- ESERCIZI slide 61 
-- Inserire come assunti oggi:  201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€
insert into coders (coder_id, first_name, last_name, hire_date, salary) values (201, 'Maria', 'Rossi', curdate(), 5000);
insert into coders (coder_id, first_name, last_name, hire_date, salary) values (202, 'Franco', 'Bianchi', curdate(), 4500);

-- Cambiare il nome da Maria a Mariangela
update coders
set first_name = 'Maria'
where first_name = 'Mariangela';

-- Aumentare di 500€ i salari minori di 6000€
update coders 
set salary = salary + 500
where salary < 6000;

-- eliminare Franco Bianchi
delete from coders
where first_name = 'Franco' and last_name = 'Bianchi';

commit;