CREATE TABLE IF NOT EXISTS "ORDER" (
  id           IDENTITY,
  userid       BIGINT,
  createdate   TIMESTAMP,
  completedate TIMESTAMP,
  subtotal     DECIMAL,
  status       ENUM ('AWAITING_PAYMENT',
                     'PROCESSING',
                     'SHIPPED',
                     'DELIVERED',
                     'COMPLETED'),
  FOREIGN KEY (userid) REFERENCES USER (id)
);
