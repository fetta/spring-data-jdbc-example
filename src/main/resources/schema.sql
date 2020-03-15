create sequence player_id_sequence start 8008135 increment by 50;

create table team (id serial primary key, name text);
create table player (id int NOT NULL DEFAULT nextval('player_id_sequence') primary key, name text, email text, dateOfBirth timestamp, team int, team_key int);
