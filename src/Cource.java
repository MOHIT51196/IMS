import java.sql.Date;
import java.util.LinkedHashSet;

public class Cource implements Comparable<Cource>{
	private String id;
	private String name;
	private String category;
	private double courceFee;
	private LinkedHashSet<Lecturer> facultySet = new LinkedHashSet<>();
	private String totalClasses;
	private Date startDate;
	private Date endDate;	//estimation of end Date
	private String batchSchedule;
	
	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCourceFee() {
		return courceFee;
	}

	public void setCourceFee(double courceFee) {
		this.courceFee = courceFee;
	}

	
	public String getTotalClasses() {
		return totalClasses;
	}

	public void setTotalClasses(String totalClasses) {
		this.totalClasses = totalClasses;
	}

	public LinkedHashSet<Lecturer> getFacultySet() {
		return facultySet;
	}

	public void setFacultySet(LinkedHashSet<Lecturer> facultySet) {
		this.facultySet = facultySet;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	public String getBatchSchedule() {
		return batchSchedule;
	}

	public void setBatchSchedule(String batchSchedule) {
		this.batchSchedule = batchSchedule;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Cource){
			return this.id.equals(((Cource) obj).getId());
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Cource cource) {
		return this.id.compareTo(cource.getId());
	}

}
