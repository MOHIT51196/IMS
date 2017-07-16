
public class Institution {

	private String name;
	private Address address;
	private int passYear;
	private String programme;
	private String branch;
	private String status;	//dropOut or PassOut
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getPassYear() {
		return passYear;
	}
	public void setPassYear(int passYear) {
		this.passYear = passYear;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
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
		
		if(obj instanceof Institution){
			Institution institution = (Institution) obj;
			return (this.name.equals(institution.getName())
					&& this.address.equals(institution.getAddress())
					&& this.branch.equals(institution.getBranch())
					&& this.programme.equals(institution.getProgramme()));
		}
		
		return false;
	}
}
