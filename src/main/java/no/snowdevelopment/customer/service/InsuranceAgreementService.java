package no.snowdevelopment.customer.service;

/**
 * @author Henrik Solberg
 * */
public interface InsuranceAgreementService {
	Long insertInsuranceAgreement(Long customerPk, String correlationId);
	Long updateStatusOnInsuranceAgreement(Long insuranceAgreementPk, String status);
}
