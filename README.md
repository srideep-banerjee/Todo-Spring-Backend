# Todo Spring Backend

Welcome to Todo Spring Backend! This repository contains the source code of a Spring application that serves a Todo web application along with necessary REST API endpoints, while storing data in MySQL database.

## Getting Started

To get started, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory.

### ⚠️ Before you begin

1. Add a file named `application.properties` in the directory `\src\main\resources\` with the following contents:
```
spring.application.name=springexperiments
spring.datasource.url=[Your database url]
spring.datasource.username=[Your database username]
spring.datasource.password=[Your database user password]
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.error.include-stacktrace=never
```
2. Add the static web files to the directory `\src\main\resources\static\`

### Get frontend source code

The frontend source code can be found at [github.com/srideep-banerjee/Todo-React-Frontend]([url](https://github.com/srideep-banerjee/Todo-React-Frontend))
