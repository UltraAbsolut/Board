DROP TABLE IF EXISTS points;

CREATE TABLE points (
    id SERIAL PRIMARY KEY,
    type VARCHAR(255),
    color INTEGER,
    width INTEGER,
    fog BOOLEAN,
    mx REAL NOT NULL,
    my REAL NOT NULL,
    lx REAL NOT NULL,
    ly REAL NOT NULL,
    userr INTEGER
); 