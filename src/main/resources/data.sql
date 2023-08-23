DROP TABLE task;

CREATE TABLE task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255)
);

INSERT INTO task (title, description)
VALUES ( 'Buy groceries', 'Buy milk and eggs');