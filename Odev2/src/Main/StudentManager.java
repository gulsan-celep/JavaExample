package Main;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " student added");
	}
	
	public void buyCourse() {
		System.out.println("You bought the course");
	}
}
