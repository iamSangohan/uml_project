package universite_projet;

public class Student extends UniversityMember {
	public int matNo;
	public CourseExecution[] completedCourses;
	
	
	public Student(String firstName, String lastName, int ssNo, int matNo) {
	    super(firstName, lastName, ssNo);
	    this.matNo = matNo;
	    this.completedCourses = new CourseExecution[0];
	}
    
    public void addCompletedCourse(CourseExecution course) {
        if(course != null){
          if (completedCourses == null) {
            completedCourses = new CourseExecution[0];
            completedCourses[0] = course;
          } else {
        	for (int i = 0; i < completedCourses.length; i++) {
                if (completedCourses[i].semester == null) {
                	completedCourses[i] = course;
                }
            } 
          }
        }else {
          System.out.println("Instance course complete est null");
        }
    }

    public void printCompletedCourses() {
        System.out.println("Les cours completés par l'etudiant "+ this.nom +" sont :");
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