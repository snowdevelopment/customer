package no.snowdevelopment.customer.service;

/**
 * @author Henrik Solberg
 * */
public interface InsuranceAgreementService {
	Long updateStatusOnInsuranceAgreement(Long insuranceAgreementId, String status);
}
