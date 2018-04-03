package no.snowdevelopment.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.snowdevelopment.customer.database.InsuranceAgreementEntity;

/**
 * @author Henrik Solberg
 * */
@Repository
public interface InsuranceAgreementRepository extends JpaRepository<InsuranceAgreementEntity, Long> {

}
