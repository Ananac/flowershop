CREATE TABLE IF NOT EXISTS USER (
  id       IDENTITY              NOT NULL,
  username VARCHAR(50)           NOT NULL,
  password VARCHAR(50)           NOT NULL,
  fullname VARCHAR(255),
  city     VARCHAR(50),
  zipcode  VARCHAR(50),
  address  TEXT,
  balance  DECIMAL               NOT NULL,
  discount INT,
  isadmin  BOOLEAN DEFAULT FALSE NOT NULL
);

