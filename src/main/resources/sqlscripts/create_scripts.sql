CREATE SCHEMA `cafe_management_db` ;


create table user (
        id integer not null auto_increment,
        contact_number varchar(255),
        email varchar(255),
        name varchar(255),
        password varchar(255),
        role varchar(255),
        status varchar(255),
        primary key (id)
    ) engine=InnoDB
