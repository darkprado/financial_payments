create table if not exists tbl_payments
(
    id      bigserial not null,
    name    varchar(255),
    price   int4      not null,
    user_id int8,
    primary key (id)
);
create table if not exists tbl_payments_history
(
    id         bigserial not null,
    month      int4      not null,
    year       int4      not null,
    payment_id int8,
    primary key (id)
);
create table if not exists tbl_users
(
    id        bigserial not null,
    birthday  timestamp,
    email     varchar(255),
    firstname varchar(255),
    lastname  varchar(255),
    login     varchar(255),
    password  varchar(255),
    primary key (id)
);
alter table tbl_payments
    add constraint user_id foreign key (user_id) references tbl_users;
alter table tbl_payments_details
    add constraint payment_id foreign key (payment_id) references tbl_payments;
