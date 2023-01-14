package universite_projet;

import java.util.Hashtable;

public class CourseExecution {
	public int year;
	public ESemester semester;
	public Student [] student;
	public Course course;
	public Hashtable<Employee, Support> support;
		//Key: employee
		//Value! (role, hours)
	
	
    public String getCourseName() {
        return course.getName();
    }

	
    public void addStudent(Student newStudent) {
        if (student == null) {
            student = new Student[1];
            student[0] = newStudent;
        } else {
            int n = student.length;
            Student[] temp = new Student[n + 1];
            System.arraycopy(student, 0, temp, 0, n);
            temp[n] = newStudent;
            student = temp;
        }
    }

    public void printEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (int i = 0; i < student.length; i++) {
            student[i].getFullName();
        }
    }

    public void addSupportEmployee(Employee employee, ERole role, int hours) {
        support.put(employee, new Support(role, hours));
    }

}
