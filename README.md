# jpaBasic
## Basic CRUD with JPA, ~~MariaDB~~ -> H2DB, Hibernate<br/> and Testing Swagger

### Installation
```gitexclude
git clone https://github.com/dbsdud/jpaBasic.git
```

### Building from Source
```gitexclude
window : .\mvnw clean install
mac : mvn clean install
```

### Run
```gitexclude
window : .\mvnw spring-boot:run
mac : mvn spring-boot:run
```
### Package Architecture
```gitexclude
ROOT
  ㄴ src
    ㄴ main
      ㄴ java
        ㄴ com.dbsdud.jpabasic
          ㄴ common
            ㄴ config
              ㄴ resttemplate
            ㄴ error
              ㄴ exception
            ㄴ response
          ㄴ user
            ㄴ controller
            ㄴ dao
            ㄴ domain
            ㄴ dto
            ㄴ exception
            ㄴ model
            ㄴ service
      ㄴ resources
```
