package no.snowdevelopment.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.snowdevelopment.customer.database.CustomerEntity;

/**
 * @author Henrik Solberg
 * */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    
}