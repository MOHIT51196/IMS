import java.util.LinkedHashMap;

public class Lecturer implements Comparable<Lecturer>{

	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private LinkedHashMap<String, String> contactMap = new LinkedHashMap<>();	//primary and secondary
	private LinkedHashMap<String, Address> addressMap = new LinkedHashMap<>();	//permanent and temporary
	private LinkedHashMap<String, Institution> instituteMap = new LinkedHashMap<>();	//Institute worked at
	private String dob;
	private String doj;
	private String salary;
	private String status;		//permanent or temporary
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
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
		
		if(obj instanceof Lecturer){
			
			return this.id.equals(((Lecturer) obj).getId());
		}
		
		return false;
	}
	

	@Override
	public int compareTo(Lecturer lecturer) {
		return this.id.compareTo(lecturer.getId());
	}
}
