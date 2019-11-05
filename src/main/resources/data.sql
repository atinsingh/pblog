create table table_user (
    id integer not null ,
    name varchar(255),
    create_date timestamp,
    primary key (id)
);

create table category (
    id integer not null ,
    name varchar(255),
    description varchar(255),
    primary key (id)
);

create table blog (
    id integer not null ,
    author integer ,
    category integer ,
    text varchar(1024)
    create_date timestamp ,
    primary key (id),
    foreign key (author) references table_user(ID),
    foreign key (category) references category(ID)

);




