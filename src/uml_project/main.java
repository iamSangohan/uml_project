package uml_project;

import java.util.Hashtable;

public class main {

    public static void main(String[] args) {
        // creating an employee
        Employee employee1 = new Employee("John", "Doe", 12345, 1234);
        employee1.coursTermine = new CourseExecution[1];
        employee1.coursTermine[0] = new CourseExecution();
        //print employee full name
        System.out.println(employee1.getFullName());

        // creating a student
        Student student1 = new Student("Jane", "Doe", 12345, 1234);
        student1.completedCourses = new CourseExecution[1];
        student1.completedCourses[0] = new CourseExecution();
        //print student full name
        System.out.println(student1.getFullName());
        // creating a course
        Course course1 = new Course();
        course1.setCourseNo(1234);
        course1.setName("Math");
        // creating a course execution
        CourseExecution courseExecution1 = new CourseExecution();
        courseExecution1.year = 2020;
        courseExecution1.semester = ESemester.FALL;
        courseExecution1.student = new Student[1];
        courseExecution1.student[0] = student1;
        //courseExecution1.course = new Course();
        courseExecution1.course = course1;
        courseExecution1.support = new Hashtable<Employee, Support>();
        courseExecution1.addSupportEmployee(employee1, ERole.lecturer, 20);
	    // adding a completed course to the student
        student1.addCompletedCourse(courseExecution1);
	    //print completed courses of student
	    student1.printCompletedCourses();
	    //creating role
	    ERole role = ERole.examiner;
	    //print role name
	    System.out.println(ERole.getRoleName(role));
	    // get role by name
	    System.out.println(ERole.getRole("lecturer"));
	    // get the list of roles
	    System.out.println(ERole.getRoles());
	}

}

