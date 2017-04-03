<b>PostgreSQL Backup and Restore</b>

<p>
Este projeto permite realizar backup e restore de um banco de dados PostgreSQL.

Use o comando: java -jar backup-postgresql-1.0.jar databaseName databasePassword type

type = backup or restore
</p>
<br>
<p>
Esquema para criação de um banco de teste:

-- Create database ----------------------------------------------------------------

CREATE DATABASE bycar;

-- Create table car and insert values ---------------------------------------------

CREATE TABLE IF NOT EXISTS cars (
    id BIGSERIAL PRIMARY KEY,
    _name CHARACTER VARYING(50) NOT NULL,
    color CHARACTER VARYING(50) NOT NULL,
    _value REAL
);

INSERT INTO cars (_name, color, _value) VALUES ('GM Prisma Maxx', 'Silver', 25000);
INSERT INTO cars (_name, color, _value) VALUES ('Ford Ka SE', 'Black', 35000);
INSERT INTO cars (_name, color, _value) VALUES ('VW Fox TSI', 'White', 55000);
INSERT INTO cars (_name, color, _value) VALUES ('Toyota Corolla XEI', 'Red', 65000);

-- Show data -----------------------------------------------------------------------

SELECT * FROM cars;
</p>
