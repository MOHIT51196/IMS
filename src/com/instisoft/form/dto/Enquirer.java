package com.instisoft.form.dto;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Enquirer {

	private String id;
	private String firstName;
	private String lastName;
	private Date date;
	private String email;
	private LinkedHashMap<String, String> contactMap;	//primary and secondary
	private LinkedHashMap<String, Address> addressMap;	//permanent and temporary
	private String dob;
	private String relation;	//father , mother or student itself
	private LinkedHashSet<String> courceId = new LinkedHashSet<>();
	
	public String getId() {
		return id;
	}
	
//	public void setId(String id) {
//		this.id = id;
//	}
	
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
	

	public String getName(){
		return this.firstName + " " + this.lastName;
	}

	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LinkedHashMap<String, String> getContactMap() {
		return contactMap;
	}
	
	public void setContactMap(LinkedHashMap<String, String> contactMap) {
		this.contactMap = contactMap;
	}
	
	public LinkedHashMap<String, Address> getAddressMap() {
		return addressMap;
	}
	
	public void setAddressMap(LinkedHashMap<String, Address> addressMap) {
		this.addressMap = addressMap;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getRelation() {
		return relation;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public LinkedHashSet<String> getCourceId() {
		return courceId;
	}
	
	public void setCourceId(LinkedHashSet<String> courceId) {
		this.courceId = courceId;
	}
	
	
}
