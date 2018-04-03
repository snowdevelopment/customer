package no.snowdevelopment.customer.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    @Column(name = "PK_CUSTOMER")
    private Long id;

    @Column(name = "FOEDSELSNUMMER")
    private String foedselsnummer;

    @Column(name = "CORRELATION_ID")
    private String correlationId;
    
    @Column(name = "STATUS")
    private String status;
    
    
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
}
