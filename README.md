# Hibernate Maven CRUD Project (PostgreSQL)

A simple Java Maven project using **Hibernate ORM (7.0.0Final)** to perform CRUD operations on a PostgreSQL database.  
The project manages **Regions** and **Countries** tables using Hibernate's native API.


##  Technologies Used

- Java 8
- Maven
- Hibernate ORM 7.0.0Final
- PostgreSQL 17+
- STS (Spring Tool Suite) / Eclipse IDE

# Sql Query 
   CREATE TABLE regions (
    region_id SERIAL PRIMARY KEY,
    region_name VARCHAR(25)
);

CREATE TABLE countries (
    country_id CHAR(2) PRIMARY KEY,
    country_name VARCHAR(40),
    region_id INT NOT NULL,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);



