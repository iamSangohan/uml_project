package uml_project;

public class Student extends UniversityMember {
	public int matNo;
	public CourseExecution[] completedCourses;
	
	
	public Student(String firstName, String lastName, int ssNo, int matNo) {
	    super(firstName, lastName, ssNo);
	    this.matNo = matNo;
	    this.completedCourses = new CourseExecution[0];
	}

    public void addCompletedCourse(CourseExecution course) {
        if (completedCourses == null) {
            completedCourses = new CourseExecution[1];
            completedCourses[0] = course;
        } else {
            int n = completedCourses.length;
            CourseExecution[] temp = new CourseExecution[n + 1];
            System.arraycopy(completedCourses, 0, temp, 0, n);
            temp[n] = course;
            completedCourses = temp;
        }
    }

    public void printCompletedCourses() {
        System.out.println("Completed Courses:");
        for (int i = 0; i < completedCourses.length; i++) {
            System.out.println(completedCourses[i].getCourseName());
        }
    }

    public int getMatNo() {
        return matNo;
    }

    public void setMatNo(int matNo) {
        this.matNo = matNo;
    }
    
    public String getFullName() {
        return super.afficheNom();
    }

}