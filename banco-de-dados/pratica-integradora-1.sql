CREATE DATABASE store;

USE store;

CREATE TABLE department (
	id VARCHAR(45) PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    localization VARCHAR(45) NOT NULL
);

CREATE TABLE employee (
	id VARCHAR(45) PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    role VARCHAR(45) NOT NULL,
    salary REAL NOT NULL,
    commission REAL NOT NULL,
    department_id VARCHAR(45),
    FOREIGN KEY (department_id) REFERENCES department(id)
);

INSERT INTO department VALUES
("D-000-1", "Software", "Los Tigres"),
("D-000-2", "Systems", "Guadalupe"),
("D-000-3", "Accounting", "La Roca"),
("D-000-4", "Sales", "Plata");

INSERT INTO employee VALUES
("E-000-1", "César", "Piñero", "Seller", 80000, 15000, "D-000-4"),
("E-000-2", "Yosep", "Kowaleski", "Analyst", 140000, 0, "D-000-2"),
("E-000-3", "Mariela", "Barrios", "Director", 185000, 0, "D-000-3"),
("E-000-4", "Jonathan", "Aguilera", "Seller", 85000, 10000, "D-000-4"),
("E-000-5", "Daniel", "Brezezicki", "Seller", 83000, 10000, "D-000-4"),
("E-000-6", "Mito", "Barchuk", "President", 190000, 0, "D-000-3"),
("E-000-7", "Emilio", "Galarza", "Developer", 60000, 0, "D-000-1");


# 1. Selecione o nome, cargo e localização dos departamentos onde os vendedores trabalham.

SELECT employee.name, employee.role, department.localization
FROM employee
INNER JOIN department
ON employee.department_id = department.id;


# 2. Visualize departamentos com mais de cinco funcionários.

SELECT department.name AS "Department", COUNT(employee.name) AS "Employee Quantity"
FROM department
INNER JOIN employee
ON department.id = employee.department_id
GROUP BY department.name;

# 3. Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo cargo que 'Mito Barchuk'.

SELECT employee.name, employee.salary, department.name
FROM employee
INNER JOIN department
WHERE employee.department_id = department.id
AND employee.role = (SELECT role FROM employee WHERE name = "Mito" AND last_name = "Barchuk");


# 4. Mostre os dados dos funcionários que trabalham no departamento de contabilidade, ordenados por nome.

SELECT * FROM employee
WHERE department_id = "D-000-3"
ORDER BY name;


# 5. Mostre o nome do funcionário que tem o menor salário.

SELECT employee.name
FROM employee
WHERE salary = (SELECT MIN(salary) FROM employee);


# 6. Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.

SELECT * FROM employee
WHERE employee.salary = (
	SELECT MAX(seller.salary)
    FROM (
		SELECT *
        FROM employee
        WHERE department_id = "D-000-4")
	AS seller);





