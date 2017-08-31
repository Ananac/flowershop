CREATE TABLE IF NOT EXISTS  FLOWER (
  id          IDENTITY    NOT NULL,
  name        VARCHAR(50) NOT NULL,
  description TEXT,
  price       DOUBLE      NOT NULL,
  quantity    INT         NOT NULL
);


