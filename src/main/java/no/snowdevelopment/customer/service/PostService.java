package no.snowdevelopment.customer.service;

import no.snowdevelopment.customer.status.PostServiceStatus;

public interface PostService {
	PostServiceStatus sendInsuranceAgreementToCustomer(Long insuranceAgreeentId);
}
