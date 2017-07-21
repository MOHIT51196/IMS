import java.util.LinkedHashSet;

public class Course implements Comparable<Course>{
	private String id;
	private String name;
	private String category;
	private double courceFee;
	private LinkedHashSet<Faculty> facultySet = new LinkedHashSet<>();
	private String totalClasses;
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

	public LinkedHashSet<Faculty> getFacultySet() {
		return facultySet;
	}

	public void setFacultySet(LinkedHashSet<Faculty> facultySet) {
		this.facultySet = facultySet;
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
		
		if(obj instanceof Course){
			return this.id.equals(((Course) obj).getId());
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Course cource) {
		return this.id.compareTo(cource.getId());
	}

}
