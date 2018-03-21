package ex.aaronfae.spring.highlightjpa.dao;

import ex.aaronfae.spring.highlightjpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
