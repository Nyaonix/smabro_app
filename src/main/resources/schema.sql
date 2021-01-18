DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Matches;
DROP TABLE IF EXISTS Characters;

CREATE TABLE IF NOT EXISTS Users(
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    rate INT NOT NULL,
    main_character_id int NOT NULL,
    sub1_character_id int,
    sub2_character_id int,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Matches(
    id INT AUTO_INCREMENT NOT NULL,
    user_id int NOT NULL,
    opponent_id int NOT NULL,
    status_code int NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Characters(
    id INT AUTO_INCREMENT NOT NULL,
    character_name VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);