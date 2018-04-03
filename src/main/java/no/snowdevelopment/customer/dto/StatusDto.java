package no.snowdevelopment.customer.dto;

public class StatusDto {
	public StatusDto(Long agreementId) {
		super();
		this.agreementId = agreementId;
	}

	Long agreementId;

	public Long getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
	}
}
