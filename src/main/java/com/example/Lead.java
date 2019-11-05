package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LEADS")
public class Lead {


	@Column(name="CONSULTANT_NAME")
	private String consultantName;
	  @Id
	    @Column(name = "CONSULTANT_ID",unique=true, nullable = false)
	private Long consultantId;
	 @Column(name="COMPANY")
	private String company;
	 @Column(name="LEAD_DESCRIPTION")
	private String leadDescription;
	 @Column(name="CONTACT_PERSON")
	private String contactPerson;

//	 @OneToMany(mappedBy="lead")
//	 private List<SalesPerson> salesPersons;

	private Lead() {
	}

	public Lead(String consultantName, Long consultantId, String company, String leadDescription,String contactPerson) {
		this.consultantName = consultantName;
		this.consultantId = consultantId;
		this.company = company;
		this.leadDescription = leadDescription;
		this.contactPerson = contactPerson;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((consultantId == null) ? 0 : consultantId.hashCode());
		result = prime * result + ((contactPerson == null) ? 0 : contactPerson.hashCode());
		result = prime * result + ((leadDescription == null) ? 0 : leadDescription.hashCode());
		result = prime * result + ((consultantName == null) ? 0 : consultantName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lead other = (Lead) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (consultantId == null) {
			if (other.consultantId != null)
				return false;
		} else if (!consultantId.equals(other.consultantId))
			return false;
		if (contactPerson == null) {
			if (other.contactPerson != null)
				return false;
		} else if (!contactPerson.equals(other.contactPerson))
			return false;
		if (leadDescription == null) {
			if (other.leadDescription != null)
				return false;
		} else if (!leadDescription.equals(other.leadDescription))
			return false;
		if (consultantName == null) {
			if (other.consultantName != null)
				return false;
		} else if (!consultantName.equals(other.consultantName))
			return false;
		return true;
	}

	
	 public String getConsultantName() {
		return consultantName;
	}

	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLeadDescription() {
		return leadDescription;
	}

	public void setLeadDescription(String leadDescription) {
		this.leadDescription = leadDescription;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "Consultant [ consultantName=" + consultantName + ", consultantId=" + consultantId + ", company=" + company
				+ ", leadDescription=" + leadDescription + ", contactPerson=" + contactPerson + "]";
	}
}