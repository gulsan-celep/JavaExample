package Main;

public class Student extends User{

	private String studentNumber;
	private String courseName;
	private int chapter;
	
	public Student() {
		
	}
	
	public Student(String studentNumber,String courseName,int chapter) {
		this.studentNumber = studentNumber;
		this.courseName = courseName;
		this.chapter = chapter;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getChapter() {
		return chapter;
	}
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
}
