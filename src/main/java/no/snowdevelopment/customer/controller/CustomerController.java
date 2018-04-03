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
import no.snowdevelopment.customer.service.PostService;
import no.snowdevelopment.customer.status.PostServiceStatus;

/**
 * @author Henrik Solberg
 * */
@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;
    
    @Autowired
    InsuranceAgreementService insuranceAgreementService;
    
    @Autowired
    PostService postService;

    /**
     * This method needs improvement. Operations in method must all be executed successfully.
     * If not successfully executed, this becomes a support follow-up issue.
     * - Must ensure proper handling of error situations
     * -- What if database insert/update fails?
     * -- What if call to external (micro)service fails?
     * -- Use the correlationId to track the request in different systems.
     * -- Implement exception handler.
     * */
    @RequestMapping(value = "/customer/insert/{fnr}", method = RequestMethod.POST)
    @Transactional
    public StatusDto insertCustomer(@PathVariable(value="fnr") String fnr) {
    	try {
	    	String correlationId = UUID.randomUUID().toString();
	    	
	    	Long customerPk = customerService.insertCustomer(fnr, correlationId);
	    	Long insuranceAgreeentId = insuranceAgreementService.insertInsuranceAgreement(customerPk, correlationId);
	    	
	    	PostServiceStatus postServiceStatus = postService.sendInsuranceAgreementToCustomer(insuranceAgreeentId, correlationId);
	    	if (postServiceStatus.getStatus().equals("OK")) {
	    		insuranceAgreeentId = insuranceAgreementService.updateStatusOnInsuranceAgreement(insuranceAgreeentId, "AGREEMENT_SENT");	
	    	} else {
	    		// TODO: Handle error situation.
	    	}
	    	return new StatusDto(insuranceAgreeentId, "OK");
    	} catch (Exception e) {
    		// TODO: Handle error situation.
    		return new StatusDto(-1L, "ERROR");
    	}
    }
}
