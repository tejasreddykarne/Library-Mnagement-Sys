CREATE DATABASE library;
USE library;

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    is_available BOOLEAN
);

CREATE TABLE users (
    user_id INT PRIMARY KEY,
    name VARCHAR(255)
);
