package kodlamaioOdev;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,String name, double unitPrice, String instructor) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.instructor=instructor;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String instructor;
	
}
