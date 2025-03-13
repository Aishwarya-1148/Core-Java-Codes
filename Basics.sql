# to create a database 
create database java_Internship;

# use the database 
use java_Internship;

# to create table 
create table Student ( id int , name varchar(20) , marks int );

# to see the data from table 
select * from Student;

# to insert the data into table 
insert into Student value( 1 , "Aishwarya" , 30 );
insert into Student values(2 , "Lalit" , 100 ) ,
						  (3 , "komal",90),
                          (4 , "Sankalp",80),
                          (5 , "Ganesh" , 100);

# for the description of the table 
desc student;

