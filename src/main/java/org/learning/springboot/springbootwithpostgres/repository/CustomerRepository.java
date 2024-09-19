package org.learning.springboot.springbootwithpostgres.repository;

import org.learning.springboot.springbootwithpostgres.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}
