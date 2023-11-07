# Spring-Boot-Projections-and-Rollback-Example-JPA

## Definition

The JPA documentation contains the following definition:

[DOC](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
Spring Data query methods usually return one or multiple instances of the aggregate root managed by the repository. However, it might sometimes be desirable to create projections based on certain attributes of those types. Spring Data allows modeling dedicated return types, to more selectively retrieve partial views of the managed aggregates.

> Test this project with Swagger http://localhost:8082/swagger-ui/index.html.
## Pre Requisites

- An SQL Server instance to connect the REST API

If you dont have an SQL Server instance you can create one using this docker command.

