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
    @Column(name = "SEKV_CUSTOMER")
    private Long id;

    @Column(name = "FOEDSELSNUMMER")
    private String foedselsnummer;

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
}
