-- Slide 73 Scrivere e invocare la procedura tomorrow() che stampa la data di domani

drop procedure if exists tomorrow;
delimiter //

create procedure tomorrow()
begin
select date_add(curdate(), interval 1 day);
end;

// delimiter ;

call tomorrow();

-- Modificare tomorrow() per fargli accettare come parametro un nome da stampare

drop procedure if exists tomorrow2;
delimiter //

create procedure tomorrow2 (
in p_name varchar (30)
)begin
select date_add(curdate(), interval 1 day) as 'current date', p_name;
end;

// delimiter ;

call tomorrow2('ciro');

-- Scrivere e invocare la procedura get_coder() che eitorna nome e cognome di un coder identificato via id

drop procedure if exists get_coder;
delimiter //

create procedure get_coder (
in p_coder_id integer,
out p_first_name varchar (30),
out p_last_name varchar (30)
)begin

select coder_id,  first_name, last_name
into p_coder_id, p_first_name, p_last_name
from coders
where coder_id = p_coder_id;

end;

// delimiter ;

call get_coder('107', @first, @last);
select @first, @last;
