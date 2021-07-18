# API Rest de gerenciamento de Pessoas

Projeto Spring Boot para validação de uma API Rest de gerenciamento de pessoas com deploy no Heroku.

## Stack utilizada

* Java 11
* Spring Boot
* Maven
* H2 Database
* Lombok
* MapStruct
* JUnit
* Heroku
* IntelliJ IDEA

## Informações adicionais

Para executar o projeto no terminal

```
mvn spring-boot:run 
```

Para executar a suíte de testes

```
mvn clean test
```

Para visualizar a execução do projeto

```
LOCAL: http://localhost:8080/api/v1/person
CLOUD: http://localhost:8080/api/v1/person
```

Para acessar a documentação da API

```
LOCAL: http://localhost:8080/swagger-ui.html
CLOUD: https://person-api-cloud.herokuapp.com/swagger-ui.html
```
