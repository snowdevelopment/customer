package no.snowdevelopment.customer.status;

public class PostServiceStatus {
	private String status; // TODO: Consider using enum.

	public PostServiceStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
