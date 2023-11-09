-- Leave ID to the DB to set
INSERT INTO MESSAGE (message) VALUES ('Message 1');
INSERT INTO MESSAGE (message) VALUES ('Message 2');
INSERT INTO MESSAGE (message) VALUES ('Message 3');
INSERT INTO MESSAGE (message) VALUES ('Message 4');
INSERT INTO MESSAGE (message) VALUES ('Message 5');
INSERT INTO MESSAGE (message) VALUES ('Message 6');
INSERT INTO MESSAGE (message) VALUES ('Message 7');
INSERT INTO MESSAGE (message) VALUES ('Message 8');
INSERT INTO MESSAGE (message) VALUES ('Message 9');
INSERT INTO MESSAGE (message) VALUES ('Message 10');
INSERT INTO MESSAGE (message) VALUES ('Message 11');
INSERT INTO MESSAGE (message) VALUES ('Message 12');
INSERT INTO MESSAGE (message) VALUES ('Message 13');
INSERT INTO MESSAGE (message) VALUES ('Message 14');
INSERT INTO MESSAGE (message) VALUES ('Message 15');
INSERT INTO MESSAGE (message) VALUES ('Message 16');

-- Add my initial users
INSERT INTO APP_USER (username, password, role) values ('user', 'password', 'ROLE_USER');
INSERT INTO APP_USER (username, password, role) values ('admin', 'password', 'ROLE_ADMIN');
