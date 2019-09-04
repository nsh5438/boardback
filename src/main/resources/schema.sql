drop table if exists `user`;
drop table if exists `board`;
drop table if exists `like`;

create table `user`(
   id integer primary key auto_increment,
   account varchar(100) not null unique ,
   password varchar(100) not null,
   name varchar(100),
   email varchar(100),
   gender varchar(10),
   age integer,
   profile_url varchar(100),
   imagename varchar(100)
) default charset utf8mb4 engine = InnoDB;

create table `board`(
    id integer primary key auto_increment,
    userid integer not null ,
    author varchar(100) not null,
    title varchar(100) ,
    content varchar(1000) ,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp,
    like_num integer,
    view_num integer,
    kind varchar(100) not null
) default charset utf8mb4 engine = InnoDB;

create table `like` (
    id integer primary key auto_increment,
    userid integer,
    authorid integer,
    boardid integer
)default charset utf8mb4 engine = InnoDB;

insert into user (account, password, name, email, gender, age, profile_url,imagename)
values
('user1','1234','user1','test@gmail.com','여자',20,null,null);

insert into user (account, password, name, email, gender, age, profile_url,imagename)
values
('1234','1234','user2','test2@gmail.com','여자',22,null,null);

insert into board (userid, author, title, content, like_num, view_num, kind)
values
(1,'user1','test1','test1',2,1,'기숙사');

insert into board (userid,author, title, content, like_num, view_num, kind)
values
(1,'user1','test2','test2',1,2,'기숙사');

insert into board (userid,author, title, content, like_num, view_num, kind)
values
(1,'user1','test4','test4',0,0,'3학년 1반');

insert into board (userid,author, title, content, like_num, view_num, kind)
values
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회'),
(1,'user1','test5','test5',0,0,'학생회');

insert into `like` (userid, authorid, boardid)
values (2,1,1),(2,1,1),(2,1,2);
