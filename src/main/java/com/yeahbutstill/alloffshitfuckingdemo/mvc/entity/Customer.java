package com.yeahbutstill.alloffshitfuckingdemo.mvc.entity;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.helper.PayCode;

import javax.validation.constraints.*;

public class Customer {

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;

	@NotNull(message="is required")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to 10")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char/digits")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String postalCode;

	@PayCode(value= {"PAYS", "PAY"}, message="must start with PAYS or PAY")
	@NotNull(message = "is required")
	private String payCode;

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}








