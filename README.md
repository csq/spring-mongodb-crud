## CRUD example with SpringBoot and MongoDB

<p align="center">
  <img src="/home/carlos/Descargas/Product_List_edit.png" alt="Example image" width="1000" height="500">
</p>

Small example of use SpringBoot with NoSQL database


### Requirements:
* JAVA 11 or equivalent  
* Docker and Docker-Compose  

### Install

1. Get repository

	```bash
	$ git clone https://github.com/csq/spring-mongodb-crud.git
	```
2. Configure `application.properties` and `.env` files

3.  Execute Dockerfile

	```bash
	$ docker build -t spring-app:latest .
	```
4.  Execute docker-compose.yml file

	```bash
	$ docker-compose up -d  
	```

### Configuration

Files to config.

1. `application.properties` section in `spring-mongodb-crud/src/main/resources` directory:

	```yaml
	spring.data.mongodb.database=database-name
	spring.data.mongodb.host=host
	spring.data.mongodb.port=27017
	spring.data.mongodb.username=username
	spring.data.mongodb.password=password
	```
2. Create file`.env` in `spring-mongodb-crud/` directory with content:
  
	```
	MONGO_ROOT_USERNAME=username
	MONGO_ROOT_PASSWORD=password
	STORAGE=path-directory
	```

### Usage
Access to web page
[http://localhost:8080](http://localhost:8080 "Dashboard")
