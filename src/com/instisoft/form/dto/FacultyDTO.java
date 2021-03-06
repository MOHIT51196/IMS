package com.instisoft.form.dto;
import java.util.LinkedHashMap;

public class FacultyDTO implements Comparable<FacultyDTO>{

	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	private String primaryEmail;
	private String secondaryEmail;
	private String primaryContact;
	private String secondaryContact;
	private LinkedHashMap<String, String> contactMap = new LinkedHashMap<>();	//primary and secondary
	private LinkedHashMap<String, Address> addressMap = new LinkedHashMap<>();	//permanent and temporary
	private LinkedHashMap<String, Institution> instituteMap = new LinkedHashMap<>();	//Institute worked at
	private String dob;
	private String doj;
	private double salary;
	private BatchDTO batch;
	private String status;		//permanent or temporary


	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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

	public String getName(){
		return this.firstName + " " + this.lastName;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPrimaryEmail() {
		return primaryEmail;
	}


	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}


	public String getSecondaryEmail() {
		return secondaryEmail;
	}


	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}


	public String getPrimaryContact() {
		return primaryContact;
	}


	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}


	public String getSecondaryContact() {
		return secondaryContact;
	}


	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
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


	public LinkedHashMap<String, Institution> getInstituteMap() {
		return instituteMap;
	}


	public void setInstituteMap(LinkedHashMap<String, Institution> instituteMap) {
		this.instituteMap = instituteMap;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public BatchDTO getBatch() {
		return batch;
	}


	public void setBatch(BatchDTO batch) {
		this.batch = batch;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof FacultyDTO){
			
			return this.id.equals(((FacultyDTO) obj).getId());
		}
		
		return false;
	}
	

	@Override
	public int compareTo(FacultyDTO lecturer) {
		return this.id.compareTo(lecturer.getId());
	}
}
