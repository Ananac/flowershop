CREATE TABLE User (
  id       INT          NOT NULL,
  username VARCHAR(50)  NOT NULL,
  password VARCHAR(50)  NOT NULL,
  email    VARCHAR(255) NOT NULL,
  fullname VARCHAR(255),
  address  TEXT,
  balance  DOUBLE,
  discount INT,
  isadmin  BOOLEAN
);

