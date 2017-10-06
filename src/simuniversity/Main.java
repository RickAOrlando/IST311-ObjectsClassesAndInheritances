/*
 * Last Updated: 9/8/2017
 * Class description: Main class

   Class instantiates new objects, adds them to an array list, and displays data
   using and iterator and interface
 */
package simuniversity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rick
 */
public class Main {

    public static void main(String[] args) {
        
        //Class objects for reference
        Staff staff = new Staff("","","");
        Student student = new Student("","","","","");
        Faculty faculty = new Faculty("","","");
        
        //Create ArrayList
        ArrayList list = new ArrayList();
        
        /*
        Employee
        */
        //Create 3 objects of the Employee class
        Employee employee1 = new Employee(1, "111-111-1111" ,"1/1/2017");
        Employee employee2 = new Employee(2, "222-222-222" ,"2/2/2017");
        Employee employee3 = new Employee(3, "333-333-3333" ,"3/3/2017");
        
        //Add Employee objects to the list
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        
        /*
        Student
        */
        //Create 3 objects of the Student class
        Student student1 = new Student
        ("Student1First", "Student1Last", "Student1Phone", "Student1Email", student.getStudentStatusFreshman() );
        Student student2 = new Student
        ("Student2First", "Student2Last", "Student2Phone", "Student2Email", student.getStudentStatusJunior());
        Student student3 = new Student
        ("Student3First", "Student3Last", "Student3Phone", "Student3Email", student.getStudentStatusSenior());
        
        //Add Student objects to the list
        list.add(student1);
        list.add(student2);
        list.add(student3);
        
        /*
        Staff
        */
        //Create 3 objects of the Staff class
        Staff staff1 = new Staff("Staff1FirstName", "Staff1LastName", staff.getAssistant());
        Staff staff2 = new Staff("Staff2FirstName", "Staff2LastName", staff.getFinancialAide());
        Staff staff3 = new Staff("Staff3FirstName", "Staff3LastName", staff.getTutor());
        
        //Add Staff objects to the list
        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        
        /*
        Faculty
        */
        //Create 3 objects of the Faculty class
        Faculty faculty1 = new Faculty("Faculty1FirstName", "Faculty1LastName", faculty.getFacAssistantProf());
        Faculty faculty2 = new Faculty("Faculty2FirstName", "Faculty2LastName", faculty.getFacAssociateProf());
        Faculty faculty3 = new Faculty("Faculty3FirstName", "Faculty3LastName", faculty.getFacProf());
        
        //Add Faculty objects to the list
        list.add(faculty1);
        list.add(faculty2);
        list.add(faculty3);
            
        //Create an iterator for the list
        Iterator itr = list.iterator();
        
        //Iterate through the objects
        //Iterator is using an overridden toString method in Employee/Student/Staff/Faculty
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
        
        Scanner input = new Scanner(System.in);
        
        //Change first and last name values in Faculty
        Changeable changeable = new Faculty("","","");
        System.out.println("Enter a new first and last name, then hit enter to store data in Faculty");
        changeable.ChangeName(input.next(), input.next());

        //Change first and last name values in Student
        Changeable changeable2 = new Student("","","","","");
        System.out.println("\nEnter a new first and last name, then hit enter to store data in Student");
        changeable2.ChangeName(input.next(), input.next());           
    }//end constructor   
}//end main
