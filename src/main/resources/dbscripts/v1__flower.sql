CREATE TABLE IF NOT EXISTS  FLOWER (
  id          IDENTITY    NOT NULL,
  name        VARCHAR(50) NOT NULL,
  price       DOUBLE      NOT NULL,
  quantity    INT         NOT NULL
);


INSERT INTO FLOWER (name, price, quantity)
VALUES
  ('Rose', 80, 20),
  ('Peony', 50, 42),
  ('Violet', 40, 73),
  ('Lily', 72, 60),
  ('Cornflower', 63, 69),
  ('Daffodil', 41, 85),
  ('Iris', 38, 60),
  ('Forget-me-not', 61, 86),
  ('Hyacinth', 25, 73),
  ('Mimosa', 81, 62),
  ('Orchid', 54, 75),
  ('Windflower', 32, 55);