package com.csq.springmongodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.csq.springmongodbcrud.repositories")
public class SpringMongodbCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbCrudApplication.class, args);
	}

}
