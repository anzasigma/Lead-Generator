package com.lead.email;

public class Email {

	private String salesPersonEmail;
	private String body;

	public Email() {
	}
	public Email(String salesPersonEmail, String body) {
		this.salesPersonEmail = salesPersonEmail;
		this.body = body;
	}
	
	public String getSalesPersonEmail() {
		return salesPersonEmail;
	}

	public void setSalesPersonEmail(String salesPersonEmail) {
		this.salesPersonEmail = salesPersonEmail;
	}

	

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Email{to=%s, body=%s}", getSalesPersonEmail(), getBody());
	}

}