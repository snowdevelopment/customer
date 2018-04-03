package no.snowdevelopment.customer.database.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InsuranceAgreement")
public class InsuranceAgreementEntity implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue
    @Column(name = "PK_INSURANCE_AGREEMENT")
    private Long id;

    @Column(name = "CORRELATION_ID")
    private String correlationId;
   
    @Column(name = "STATUS")
    private String status;

    // TODO: realize @ManyToOne and @JoinColumn
    @Column(name = "FK_CUSTOMER")
    private Long customerFk;
    
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

	public Long getCustomerFk() {
		return customerFk;
	}

	public void setCustomerFk(Long customerFk) {
		this.customerFk = customerFk;
	}    
}
