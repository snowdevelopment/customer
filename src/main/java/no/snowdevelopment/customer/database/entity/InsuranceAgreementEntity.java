package no.snowdevelopment.customer.database.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "InsuranceAgreement")
public class InsuranceAgreementEntity implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue
    @Column(name = "INSURANCE_AGREEMENT_ID")
    private Long id;

    @Column(name = "CORRELATION_ID")
    private String correlationId;
   
    @Column(name = "STATUS")
    private String status;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID")
    private CustomerEntity customer;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
}
