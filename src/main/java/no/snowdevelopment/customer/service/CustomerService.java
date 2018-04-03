package no.snowdevelopment.customer.service;

import no.snowdevelopment.customer.dto.StatusDto;

/**
 * @author Henrik Solberg
 * */
public interface CustomerService {
	StatusDto insertCustomer(String fnr);
}
