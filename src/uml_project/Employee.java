package uml_project;

public class Employee extends UniversityMember {
	private int acctNo;
	public CourseExecution[] coursTermine;
	
    public Employee(String firstName, String lastName, int ssNo, int acctNo) {
        super(firstName, lastName, ssNo);
        this.acctNo = acctNo;
    }

    public int getAccNo() {
    	return acctNo;
    }
	
    public void ajouterCoursTermine(CourseExecution course) {
        if (coursTermine == null) {
            coursTermine = new CourseExecution[1];
            coursTermine[0] = course;
        } else {
            int n = coursTermine.length;
            CourseExecution[] temp = new CourseExecution[n + 1];
            System.arraycopy(coursTermine, 0, temp, 0, n);
            temp[n] = course;
            coursTermine = temp;
        }
    }
    
    public void afficherCoursTermine() {
        System.out.println("Completed Courses:");
        for (int i = 0; i < coursTermine.length; i++) {
            System.out.println(coursTermine[i].getCourseName());
        }
    }

	public String getFullName() {
		// TODO Auto-generated method stub
		return super.afficheNom();
	}


}
