package no.snowdevelopment.customer.service;

import org.springframework.stereotype.Service;

import no.snowdevelopment.customer.status.PostServiceStatus;

@Service
public class PostServiceMockImpl implements PostService {

	/**
	 * This service will be realized as a (mirco)service using REST. 
	 * */
	@Override
	public PostServiceStatus sendInsuranceAgreementToCustomer(Long insuranceAgreeentId, String correlationId) {
		return new PostServiceStatus("OK");
	}

}
