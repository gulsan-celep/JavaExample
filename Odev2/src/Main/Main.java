package Main;

public class Main {

	public static void main(String[] args) {

		Student student = new Student("12345","Java Programlama",5);
		student.setFirstName("Efe");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.buyCourse();
		
		Instructor instructor = new Instructor();
		instructor.setBranch("Developer");
		instructor.setJob("Software Engineer");
		instructor.setUniversity("CBU");
		instructor.setFirstName("Gülþan");
		
		String[] course = {"C#","Java","sql"};
		
		instructor.setGivenCourse(course);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.getCourse(instructor);
		instructorManager.signIn();
	}

}
