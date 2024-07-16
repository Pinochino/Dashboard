CREATE TABLE Customer (
                      id SERIAL PRIMARY KEY,
                      username VARCHAR(30) NOT NULL,
                      password VARCHAR(30) NOT NULL,
                      firstName VARCHAR(30) NOT NULL,
                      lastName VARCHAR(30) NOT NULL,
                      dob DATE NOT NULL
);
