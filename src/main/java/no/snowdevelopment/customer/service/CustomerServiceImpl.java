package no.snowdevelopment.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.snowdevelopment.customer.database.entity.CustomerEntity;
import no.snowdevelopment.customer.database.repository.CustomerRepository;

/**
 * @author Henrik Solberg
 * */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

	@Override
	public Long insertCustomer(String fnr, String correlationId) {
        CustomerEntity entity = new CustomerEntity();
        entity.setFoedselsnummer(fnr);
        entity.setCorrelationId(correlationId);
        entity.setStatus("CREATED"); // TODO: consider using enum.
        
    	return customerRepository.save(entity).getId();
	}
}
