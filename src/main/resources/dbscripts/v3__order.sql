CREATE TABLE IF NOT EXISTS  "ORDER" (
  id           IDENTITY           NOT NULL,
  userid       BIGINT             NOT NULL,
  createdate   TIMESTAMP          NOT NULL,
  completedate TIMESTAMP,
  subtotal     DECIMAL            NOT NULL,
  status       ENUM ('AWAITING_PAYMENT',
                     'PROCESSING',
                     'SHIPPED',
                     'DELIVERED',
                     'COMPLETED') NOT NULL,
  FOREIGN KEY (userid) REFERENCES USER (id)
);
