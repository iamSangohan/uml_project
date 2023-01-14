package universite_projet;

import java.util.Hashtable;

public class main {

    public static void main(String[] args) {
        // 	Creation d'un instance d'employé
        Employee employee1 = new Employee("John", "Doe", 12345, 1234);
        employee1.completedCourses = new CourseExecution[1];
        employee1.completedCourses[0] = new CourseExecution();
        //	Nous affichons le nom complet de l'employé créé
        System.out.println("L'employe enregistre se nomme : "+employee1.getFullName());

        // 	Creation d'une instance d'etudiant
        Student student1 = new Student("Jane", "Doe", 12345, 1234);
        student1.completedCourses = new CourseExecution[1];
        student1.completedCourses[0] = new CourseExecution();
        //	Nous affichons le nom complet de l'etudiant créé
        System.out.println("L'etudiant cree se nomme : "+student1.getFullName());
        
        // 	Creation d'un cours
        Course course1 = new Course();
        course1.setCourseNo(1234);
        course1.setName("Math");
        
        // 	Creation d'un cours completé
        CourseExecution courseExecution1 = new CourseExecution();
        courseExecution1.year = 2020;
        courseExecution1.semester = ESemester.FALL;
        courseExecution1.student = new Student[1];
        courseExecution1.student[0] = student1;
        courseExecution1.course = course1;
        courseExecution1.support = new Hashtable<Employee, Support>();
        courseExecution1.addSupportEmployee(employee1, ERole.lecturer, 20);
	    
        // 	Nous ajoutons maintenant le cours terminé dans la liste des cours de l'etudiant 1
        student1.addCompletedCourse(courseExecution1);
	    
        //	Affichage des cours terminés
	    student1.printCompletedCourses();
	}

}

