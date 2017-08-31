CREATE TABLE "Order" (
  id           IDENTITY           NOT NULL,
  userid       BIGINT             NOT NULL,
  createdate   TIMESTAMP          NOT NULL,
  completedate TIMESTAMP,
  subtotal     DECIMAL            NOT NULL,
  status       ENUM ('AWAITING_PAYMENT',
                     'PROCESSING',
                     'SHIPPED',
                     'DELIVERED',
                     'COMPLETED') NOT NULL
);
