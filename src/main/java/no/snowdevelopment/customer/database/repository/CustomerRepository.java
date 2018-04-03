package no.snowdevelopment.customer.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.snowdevelopment.customer.database.entity.CustomerEntity;

/**
 * @author Henrik Solberg
 * */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    
}