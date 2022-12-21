CREATE DATABASE employee;

USE employee;

CREATE TABLE department
(
department_id varchar(20) PRIMARY KEY,
department_name varchar(30)
); 

CREATE TABLE employee
(
employee_id varchar(20) PRIMARY KEY,
employee_name char(20),
salary int,
department_id varchar(20),
FOREIGN KEY (department_id) REFERENCES department(department_id)
);

SELECT * FROM employee;

select employee_id, employee_name, department_name 
FROM employee,department 
WHERE employee.department_id=department.department_id;

SELECT employee_id,employee_name,salary
FROM employee
ORDER BY salary DESC;

SELECT AVG(salary) AS avg_salary, department_name 
FROM employee, department
WHERE employee.department_id=department.department_id 
GROUP BY department_name;







