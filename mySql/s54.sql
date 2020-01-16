create table items (
    item_id integer primary key auto_increment,
    status char default 'a',
    name varchar(20),
    coder_id integer);
    
insert into items (name, coder_id) values ('pincopallino', 38);
insert into items (name, coder_id) values ('pio', 58);

commit;

delete from items;
rollback;

select * from items;