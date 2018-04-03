package no.snowdevelopment.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.snowdevelopment.customer.database.CustomerEntity;
import no.snowdevelopment.customer.dto.StatusDto;
import no.snowdevelopment.customer.repository.CustomerRepository;

/**
 * @author Henrik Solberg
 * */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

	@Override
	public StatusDto insertCustomer(String fnr) {
        CustomerEntity entity = new CustomerEntity();
        entity.setFoedselsnummer(fnr);
        
    	customerRepository.save(entity);
		
    	return new StatusDto();
	}
}
