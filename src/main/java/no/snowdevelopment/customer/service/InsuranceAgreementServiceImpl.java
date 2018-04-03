package no.snowdevelopment.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.snowdevelopment.customer.database.entity.InsuranceAgreementEntity;
import no.snowdevelopment.customer.database.repository.InsuranceAgreementRepository;

/**
 * @author Henrik Solberg
 * */
@Service
public class InsuranceAgreementServiceImpl implements InsuranceAgreementService {

	@Autowired
	private InsuranceAgreementRepository insuranceAgreementRepository;
	
	@Override
	public Long updateStatusOnInsuranceAgreement(Long insuranceAgreementId, String status) {
		Optional<InsuranceAgreementEntity> entity = insuranceAgreementRepository.findById(insuranceAgreementId);
		if (entity.isPresent()) {
			entity.get().setStatus(status);
			return insuranceAgreementRepository.save(entity.get()).getId();
		}
		// TODO: Errorhandling.
		return -1L;
	}
}
