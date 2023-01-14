package universite_projet;

public class Employee extends UniversityMember {
	private int acctNo;
	public CourseExecution[] completedCourses;
	
    public Employee(String firstName, String lastName, int ssNo, int acctNo) {
        super(firstName, lastName, ssNo);
        this.acctNo = acctNo;
    }

    public int getAccNo() {
    	return acctNo;
    }
	
    public void ajoutercompletedCourses(CourseExecution course) {
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
    
    public void affichercompletedCourses() {
        System.out.println("Completed Courses:");
        for (int i = 0; i < completedCourses.length; i++) {
            System.out.println(completedCourses[i].getCourseName());
        }
    }

	public String getFullName() {
		// TODO Auto-generated method stub
		return super.afficheNom();
	}


}
