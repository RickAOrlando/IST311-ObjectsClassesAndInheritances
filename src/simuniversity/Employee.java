/*
 * Last Updated: 9/8/2017
 * Class description: Child class of Person.

   Class handles employee data, encapulates variables, and overrides toString method
 */
package simuniversity;

/**
 *
 * @author Rick
 */
public class Employee extends Person {
    private int empOfficeNum;
    private String empPhoneNum;
    private String empDateOfEmployment;
    
    Employee(int empOfficeNum, String empPhoneNum, String empDateOfEmployment) {
        super(null, null, null, null);
        
        this.empOfficeNum = empOfficeNum;
        this.empPhoneNum = empPhoneNum;
        this.empDateOfEmployment = empDateOfEmployment; 
}
    
    //Override toString method for proper output
    @Override
    public String toString() {
        return String.format(
                "Class: " + Employee.class.getSimpleName() + 
                "\nRoom: " + getEmpOfficeNum() + 
                "\nPhone: " + getEmpPhoneNum() +
                "\nEmployment Date: " + getEmpDateOfEmployment() +
                "\n");
    }

    /**
     * @return the empOfficeNum
     */
    public int getEmpOfficeNum() {
        return empOfficeNum;
    }

    /**
     * @param empOfficeNum the empOfficeNum to set
     */
    public void setEmpOfficeNum(int empOfficeNum) {
        this.empOfficeNum = empOfficeNum;
    }

    /**
     * @return the empPhoneNum
     */
    public String getEmpPhoneNum() {
        return empPhoneNum;
    }

    /**
     * @param empPhoneNum the empPhoneNum to set
     */
    public void setEmpPhoneNum(String empPhoneNum) {
        this.empPhoneNum = empPhoneNum;
    }

    /**
     * @return the empDateOfEmployment
     */
    public String getEmpDateOfEmployment() {
        return empDateOfEmployment;
    }

    /**
     * @param empDateOfEmployment the empDateOfEmployment to set
     */
    public void setEmpDateOfEmployment(String empDateOfEmployment) {
        this.empDateOfEmployment = empDateOfEmployment;
    }  
}
