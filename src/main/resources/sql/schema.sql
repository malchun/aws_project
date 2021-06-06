CREATE TABLE IF NOT EXISTS products (
    id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    description            VARCHAR      NOT NULL
);