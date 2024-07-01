CREATE TABLE Customer
(
    id        SERIAL PRIMARY KEY,
    firstName VARCHAR(45),
    lastName  VARCHAR(45),
    email     VARCHAR(40),
    password  VARCHAR(30),
    address   VARCHAR(10)
)