CREATE TABLE USER (
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  USERNAME VARCHAR (32) NOT NULL,
  PASSWORD VARCHAR (64) NOT NULL,
  UNIQUE (USERNAME)
);