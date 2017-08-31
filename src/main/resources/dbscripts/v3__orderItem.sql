CREATE TABLE OrderItem (
  id      IDENTITY NOT NULL,
  orderid BIGINT   NOT NULL,
  amount  INT      NOT NULL
);