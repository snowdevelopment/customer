package no.snowdevelopment.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import no.snowdevelopment.customer.dto.StatusDto;
import no.snowdevelopment.customer.service.CustomerService;

/**
 * @author Henrik Solberg
 * */
@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer/insert/{fnr}", method = RequestMethod.POST)
    public StatusDto insertCustomer(@PathVariable(value="fnr") String fnr) {
    	StatusDto result = customerService.insertCustomer(fnr);
    	return result;
    }
}
