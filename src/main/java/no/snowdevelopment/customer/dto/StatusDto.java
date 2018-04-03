package no.snowdevelopment.customer.dto;

/**
 * @author Henrik Solberg
 * */
public class StatusDto {
	
	private Long agreementId;
	private String status;
	
	public StatusDto(Long agreementId, String status) {
		this.agreementId = agreementId;
		this.status = status;
	}

	

	public Long getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
}
