INSERT INTO USERS VALUES
(1, 'Giovanny Granda', 'ggranda', '$2a$10$DzXXpW6FJqiP2zjLgshb6OtqtRGVc5FOYaasP6c7oq9EJ/Yqk6YKe', TRUE),
(2, 'Nicholas Cage', 'user', '$2a$10$oRWPnV0ugIQMzAFksOESOureo/mwCtYnB93.fRc.joF7Wu0w7l5w.', TRUE);

INSERT INTO AUTHORITIES VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

INSERT INTO USERS_AUTHORITIES VALUES
(1, 1),
(2, 2);

