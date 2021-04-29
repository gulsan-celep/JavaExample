package Main;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " instructor added.");
	}
	
	public void getCourse(Instructor instructor) {
		System.out.println("Course listelendi");
	}
}
