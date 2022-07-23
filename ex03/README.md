*오라클 사용자 생성
create user book IDENTIFIED by book
default TABLESPACE users
TEMPORARY TABLESPACE temp;

grant connect, dba to book;