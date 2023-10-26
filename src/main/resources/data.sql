-- Leave ID to the DB to set
INSERT INTO MESSAGE (message) VALUES ('Message1');

-- Add my initial users
INSERT INTO APP_USER (username, password, role) values ('user', 'password', 'ROLE_USER');
INSERT INTO APP_USER (username, password, role) values ('admin', 'password', 'ROLE_ADMIN');
