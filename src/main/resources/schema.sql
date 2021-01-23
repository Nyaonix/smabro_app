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
    used_character1_id int NOT NULL,
    used_character2_id int,
    used_character3_id int,
    opponent_character1_id int NOT NULL,
    opponent_character2_id int,
    opponent_character3_id int,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Characters(
    id INT AUTO_INCREMENT NOT NULL,
    character_name VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO Characters (character_name)
VALUES ("マリオ");

INSERT INTO Characters (character_name)
VALUES ("ヨッシー");

INSERT INTO Characters (character_name)
VALUES ("ルイージ");

INSERT INTO Users (name, password, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser1", "testPassword", 1500, 1, 2, 3);


INSERT INTO Users (name, password, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser2", "testPassword", 1800, 3, 2, 1);
