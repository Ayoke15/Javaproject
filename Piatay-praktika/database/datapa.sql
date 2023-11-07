CREATE DATABASE IF NOT EXISTS your_database_name;
USE your_database_name;
CREATE TABLE Book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    author VARCHAR(255),
    sellerId VARCHAR(255),
    productType VARCHAR(255),
    price DOUBLE,
    title VARCHAR(255)
);

CREATE TABLE Client (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE Telephone (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    manufacturer VARCHAR(255),
    batteryCapacity INT,
    sellerId VARCHAR(255),
    productType VARCHAR(255),
    price DOUBLE,
    name VARCHAR(255)
);

CREATE TABLE WashingMachine (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    manufacturer VARCHAR(255),
    tankVolume INT,
    sellerId VARCHAR(255),
    productType VARCHAR(255),
    price DOUBLE,
    name VARCHAR(255)
);

-- Заполнение таблицы Book
INSERT INTO Book (author, sellerId, productType, price, title) VALUES ('George Orwell', '1', 'Fiction', 10.5, '1984');
INSERT INTO Book (author, sellerId, productType, price, title) VALUES ('J.K. Rowling', '2', 'Fantasy', 15.5, 'Harry Potter');

-- Заполнение таблицы Client
INSERT INTO Client (name, email, login, password) VALUES ('Alice', 'alice@email.com', 'alice', 'password123');
INSERT INTO Client (name, email, login, password) VALUES ('Bob', 'bob@email.com', 'bob', 'password123');

-- Заполнение таблицы Telephone
INSERT INTO Telephone (manufacturer, batteryCapacity, sellerId, productType, price, name) VALUES ('Apple', 3000, '1', 'Smartphone', 999.99, 'iPhone 12');
INSERT INTO Telephone (manufacturer, batteryCapacity, sellerId, productType, price, name) VALUES ('Samsung', 4000, '2', 'Smartphone', 899.99, 'Galaxy S21');

-- Заполнение таблицы WashingMachine
INSERT INTO WashingMachine (manufacturer, tankVolume, sellerId, productType, price, name) VALUES ('LG', 50, '1', 'Home Appliance', 499.99, 'LG Turbo');
INSERT INTO WashingMachine (manufacturer, tankVolume, sellerId, productType, price, name) VALUES ('Samsung', 55, '2', 'Home Appliance', 549.99, 'Samsung Aqua');
