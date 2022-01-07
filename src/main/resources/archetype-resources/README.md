# slimboot
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/fortytwobinary/labdocs/blob/main/LICENSE)

[![VirtualYou][vy-image]](https://virtualyou.info)

Build Restful lightweight APIs for a microservices system/application using Spring Boot, Web Starter, JPA and MySQL.
This API template uses no Spring security however, it does provide HATEOAS. This project is one of several that will
provide design elements for microservices that will make up a larger system and be managed behind an API Gateway.

## Configuration

### Configure Persistence
This API uses JPA/Hibernate for application persistence. Use the docker-compose file in the 
project directory to run a local instance of MySQL for testing. 
```bash
docker-compose up
```
Next, run the sql at `data/slimboot.sql` on the command-line or using a database client tool.
Your database is now created and some play data has been added.

### Review Application Properties
Take a look at `src/main/resources/application.properties`

### Run
```bash
mvn spring-boot:run
```
The app is now hosted at <http://localhost:8080>

## Rest API

The app provides the following CRUD APIs.

### Contact

| Method | Url | Decription | Sample Valid Request Body | 
| ------ | --- | ---------- | --------------------------- |
| GET    | /api/contacts    | Get All Contacts | [JSON]($getallcontacts) |
| POST   | /api/contacts    | Later |  |
| PUT    | /api/contacts    | Later |  |


## Sample JSON 

##### <a id="getallcontacts">GET Contacts -> /api/contacts</a>
```json
{
  "content": [
    {
      "id": 2,
      "entity": "Sally Smith",
      "phone": "919-633-9345",
      "email": "sallys@gmail.com"
    },
    {
      "id": 1,
      "entity": "David L Whitehurst",
      "phone": "919-605-6529",
      "email": "dlwhitehurst@gmail.com"
    }
  ],
  "page": 0,
  "size": 30,
  "totalElements": 2,
  "totalPages": 1,
  "last": true
}
```
[vy-image]: https://wordpress.fortytwobinary.com/wp-content/uploads/2021/12/vy.png
