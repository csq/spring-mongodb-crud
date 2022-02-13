package com.csq.springmongodbcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.csq.springmongodbcrud.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

    @Override
    public void delete(Product product);
}
