package no.snowdevelopment.customer.database.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Henrik Solberg
 * */
@Entity
@Table(name = "Customer")
public class CustomerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ID")
    private Long id;

    @Column(name = "FOEDSELSNUMMER")
    private String foedselsnummer;

    @Column(name = "CORRELATION_ID")
    private String correlationId;
    
    @Column(name = "STATUS")
    private String status;
    
    @OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
    private List<InsuranceAgreementEntity> insuranceAgreements;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoedselsnummer() {
		return foedselsnummer;
	}

	public void setFoedselsnummer(String foedselsnummer) {
		this.foedselsnummer = foedselsnummer;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<InsuranceAgreementEntity> getInsuranceAgreements() {
		return insuranceAgreements;
	}

	public void addInsuranceAgreements(InsuranceAgreementEntity insuranceAgreement) {
		if (insuranceAgreements == null) {
			insuranceAgreements = new ArrayList<InsuranceAgreementEntity>();
		}
		insuranceAgreements.add(insuranceAgreement);
	}
}
