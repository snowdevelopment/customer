package no.snowdevelopment.customer.service;


/**
 * @author Henrik Solberg
 * */
public interface CustomerService {
	Long insertCustomer(String fnr, String correlationId);
}
