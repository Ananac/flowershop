CREATE TABLE IF NOT EXISTS USER (
  id       IDENTITY                      NOT NULL,
  username VARCHAR(50)                   NOT NULL,
  password VARCHAR(50)                   NOT NULL,
  fullname VARCHAR(255),
  city     VARCHAR(50),
  zipcode  INT,
  address  TEXT,
  balance  DECIMAL DEFAULT 500           NOT NULL,
  discount INT,
  isadmin  BOOLEAN DEFAULT FALSE         NOT NULL
);

INSERT INTO USER (username, password, fullname, city, zipcode, address, discount, isadmin)
VALUES ('admin', 'admin123', 'admin', ' ', 0, ' ', 10, TRUED);