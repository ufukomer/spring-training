DROP TABLE customer IF exists

  CREATE TABLE customer (
    id        INTEGER IDENTITY PRIMARY KEY,
    firstName VARCHAR(50),
    lastName  VARCHAR(50),
    number    VARCHAR(50)
  );