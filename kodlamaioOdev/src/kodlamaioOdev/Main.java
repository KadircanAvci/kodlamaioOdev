package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Mehmet","Deniz", "asd@gmail.com");
		User user2 = new User(2,"Ali","Kol","qwe@gmail.com");
		User user3 = new User(3,"Selma","Dal","zxc@gmail.com");
		
		
		User[] users = {user1,user2,user3};
		
		for (User user : users) {
			
			System.out.println("Kullanıcı "+user.id +":"+user.name);
		}
		
		Course course1 = new Course(1,"JavaScript",0,"Engin Demirog");
		Course course2 = new Course(2,"C# + Angular",0,"Engin Demirog");
		Course course3 = new Course(3,"Java + React",0,"Engin Demirog");
		Course course4 = new Course(4,"Programlamaya Giriş İçin Temel Kurs",0,"Engin Demirog");
		
		Course[] courses= {course1,course2,course3,course4};
		
		for (Course course : courses) {
			System.out.println("Kurs Adı :" +course.name);
		}
		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"Yapay Zeka");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println("Kategori Adı :"+category.name);
		}
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.join(course1);
		courseManager.join(course2);
		courseManager.join(course3);
		courseManager.join(course4);
		
		courseManager.delete(course4);
	}
		
		

}
