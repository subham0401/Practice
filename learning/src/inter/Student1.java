package inter;

public class Student1 implements Student_properties {
	private int ageOfStudent;
	private String nameOfStudent;
	
	
	public int getAgeOfStudent() {
		return ageOfStudent;
	}
	public void setAgeOfStudent(int ageOfStudent) {
		this.ageOfStudent = ageOfStudent;
	}
	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	@Override
	public String studentProperties() {
		
		return("all student is nice");
	}
	
	
	
	

}
