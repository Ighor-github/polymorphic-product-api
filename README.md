## API REST - Herança e polimorfismo combinados em uma API REST

Essa aplicação é uma aplicação construída com **Spring Boot** e **Spring Data JPA**, utilizando um banco de dados H2 em memória. O objetivo principal dessa aplicação é aplicar conceitos de **herança** e **polimorfismo** no contexto **POO**, aplicados em uma arquitetura de API moderna e organizada.

-----

## Objetivo

O foco dessa aplicação foi **aplicar conceitos de herança e polimorfismo**, aplicando esses conceitos em uma API REST com persistência em um banco de dados relacional. Utilizando recursos do **Spring Boot** e **JPA** (Para fazer CRUD com o banco de dados). A aplicação segue uma `arquitetura em camadas` com o foco em criar uma API bem estruturada e facil de fazer a manutençao. Essa aplicação é composta por:

- **Camada Entity**: Contém as entidades e suas relações, incluindo o uso de herança entre as entidades
- **Camada Repository**: Interfaces que estendem o `JpaRepository`, responsáveis por realizar o CRUD no banco de dados e acessar os dados
- **Camada DTO (Data Trasfer Object)**: Uma camada que faz o isolamento e proteção das minhas entidades
- **Camada Service**: Atua como uma camada intermediária entre o controller e o repository, além de conter regras de nogocio da aplicação
- **Camada Controller**: Expõe os endpoints REST e delega as chamadas à camada `Service`

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven
- Swagger (Springdoc OpenAPI)
