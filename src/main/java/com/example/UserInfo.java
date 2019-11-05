package com.example;

import java.util.List;

public class UserInfo {
//private  List<String>  businessPhones;
//public List<String> getBusinessPhones() {
//	return businessPhones;
//}
//public void setBusinessPhones(List<String> businessPhones) {
//	this.businessPhones = businessPhones;
//}
public String getGivenName() {
	return givenName;
}
public void setGivenName(String givenName) {
	this.givenName = givenName;
}
@Override
public String toString() {
	return "UserInfo [businessPhones="  + ", givenName=" + givenName + ", jobTitle=" + jobTitle
			+ ", mail=" + mail + ", mobilePhone=" + mobilePhone + ", officeLocation=" + officeLocation
			+ ", preferredLanguage=" + preferredLanguage + ", surname=" + surname + ", userPrincipalName="
			+ userPrincipalName + ", id=" + id + "]";
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getMobilePhone() {
	return mobilePhone;
}
public void setMobilePhone(String mobilePhone) {
	this.mobilePhone = mobilePhone;
}
public String getOfficeLocation() {
	return officeLocation;
}
public void setOfficeLocation(String officeLocation) {
	this.officeLocation = officeLocation;
}
public String getPreferredLanguage() {
	return preferredLanguage;
}
public void setPreferredLanguage(String preferredLanguage) {
	this.preferredLanguage = preferredLanguage;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getUserPrincipalName() {
	return userPrincipalName;
}
public void setUserPrincipalName(String userPrincipalName) {
	this.userPrincipalName = userPrincipalName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private String givenName;
private String jobTitle;
private String mail;
private String mobilePhone;
private String officeLocation;
private String preferredLanguage;
private String surname;
private String userPrincipalName;
private String id;

}
