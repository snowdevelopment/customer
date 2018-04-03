package no.snowdevelopment.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.snowdevelopment.customer.database.entity.CustomerEntity;
import no.snowdevelopment.customer.database.entity.InsuranceAgreementEntity;
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
		InsuranceAgreementEntity iaEntity = new InsuranceAgreementEntity();
		iaEntity.setCorrelationId(correlationId);
		iaEntity.setStatus("CREATED");
		
        CustomerEntity cEntity = new CustomerEntity();
        cEntity.setFoedselsnummer(fnr);
        cEntity.setCorrelationId(correlationId);
        cEntity.setStatus("CREATED"); // TODO: consider using enum.
        cEntity.addInsuranceAgreements(iaEntity);

        iaEntity.setCustomer(cEntity);
        customerRepository.save(cEntity);
    	return iaEntity.getId();
	}
}
