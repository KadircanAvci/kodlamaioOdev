package kodlamaioOdev;

public class CourseManager {
	
	public void join(Course course) {
		
		System.out.println("Programa dahil olundu :" +course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Programdan çıkıldı :" +course.name);
	}
}
