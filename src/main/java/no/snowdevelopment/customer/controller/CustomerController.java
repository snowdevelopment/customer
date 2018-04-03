package no.snowdevelopment.customer.controller;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import no.snowdevelopment.customer.dto.StatusDto;
import no.snowdevelopment.customer.service.CustomerService;
import no.snowdevelopment.customer.service.InsuranceAgreementService;

/**
 * @author Henrik Solberg
 * */
@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;
    
    @Autowired
    InsuranceAgreementService insuranceAgreementService;

    @RequestMapping(value = "/customer/insert/{fnr}", method = RequestMethod.POST)
    @Transactional
    public StatusDto insertCustomer(@PathVariable(value="fnr") String fnr) {
    	String correlationId = UUID.randomUUID().toString();
    	
    	Long customerPk = customerService.insertCustomer(fnr, correlationId);
    	Long insuranceAgreeentId = insuranceAgreementService.insertInsuranceAgreement(customerPk, correlationId);
    	
    	// TODO: Send agreement to customer
    	
    	insuranceAgreeentId = insuranceAgreementService.updateStatusOnInsuranceAgreement(insuranceAgreeentId, "AGREEMENT_SENT");
    	return new StatusDto(insuranceAgreeentId);
    }
}
