/*
 * Last Updated: 9/8/2017
 * Class description: Child class of Person. Implements Changeable interface

   Class sets constant variables, overrides toString method and ChaneName method, 
   and encapsulates data
 */
package simuniversity;

/**
 *
 * @author Rick
 */
public class Student extends Person implements Changeable {
    private final String studentStatusFreshman = "Freshman";
    private final String studentStatusSophmore = "Sophmore";
    private final String studentStatusJunior = "Junior";
    private final String studentStatusSenior = "Senior";
    private String stuTitle;
    
    Student(String fName, String lName, String pNumber, String email, String stuTitle) {
        super(null, null, null, null);
        this.fName = fName;
        this.lName = lName;
        this.pNumber = pNumber;
        this.email = email;
        this.stuTitle = stuTitle;
    }
    
    //Override toString method for proper output
    @Override
    public String toString() {
        return String.format(
                "Class: " + Student.class.getSimpleName() + 
                "\nFirst Name: " + this.getfName() + 
                "\nLast Name: " + this.getlName() +
                "\nPhone Number: " + this.getpNumber() +
                "\nEmail: " + this.getEmail() +
                "\nTitle: " +  this.getStuTitle() +
                "\n");
               
    }

    //ChangeName method accepting two args to change name
    @Override
    public void ChangeName(String fName, String lName) {
       this.fName = fName;
       this.lName = lName;
       
       System.out.println("\nChanged data stored in Student. First and last name changed successfully");
       
       //Changing data to new names entered by user through the interface
       this.setfName(fName);
       this.setlName(lName);
       
       //Printing new names to show change
       System.out.println("New first name: " + this.getfName());
       System.out.println("New last name: " + this.getlName());
    }

    /**
     * @return the studentStatusFreshman
     */
    public String getStudentStatusFreshman() {
        return studentStatusFreshman;
    }

    /**
     * @return the studentStatusSophmore
     */
    public String getStudentStatusSophmore() {
        return studentStatusSophmore;
    }

    /**
     * @return the studentStatusJunior
     */
    public String getStudentStatusJunior() {
        return studentStatusJunior;
    }

    /**
     * @return the studentStatusSenior
     */
    public String getStudentStatusSenior() {
        return studentStatusSenior;
    }

    /**
     * @return the stuTitle
     */
    public String getStuTitle() {
        return stuTitle;
    }

    /**
     * @param stuTitle the stuTitle to set
     */
    public void setStuTitle(String stuTitle) {
        this.stuTitle = stuTitle;
    }
 
}
