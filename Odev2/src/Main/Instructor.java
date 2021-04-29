package Main;

public class Instructor extends User{

	private String branch;
	private String job;
	private String[] givenCourse;
	private String[] experiences;
	private String university;
	
	public Instructor() {
		
	}
	
	public Instructor(String branch,String job,String[] givenCourse,String[] experiences,String university) {
		this.branch = branch;
		this.job = job;
		this.givenCourse = givenCourse;
		this.experiences = experiences;
		this.university = university;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getGivenCourse() {
		return givenCourse;
	}
	public void setGivenCourse(String[] givenCourse) {
		this.givenCourse = givenCourse;
	}
	public String[] getExperiences() {
		return experiences;
	}
	public void setExperiences(String[] experiences) {
		this.experiences = experiences;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}

}
