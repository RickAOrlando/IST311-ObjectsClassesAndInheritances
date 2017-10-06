/*
 * Last Updated: 9/8/2017
 * Class description: Child class of Employee.

   Class declares constant variables, encapulates variables, and overrides toString method
 */
package simuniversity;

/**
 *
 * @author Rick
 */
public class Staff extends Employee {
    private String title;
    private final String assistant = "Assistant";
    private final String tutor = "Tutor";
    private final String financialAide = "Financial Aide";
    Staff staff;
    
    Staff(String fName, String lName, String title) {
        super(0 , null, null);
        this.title = title;
        this.fName = fName;
        this.lName = lName;
    }
    
    //Override toString method for proper output
    @Override
    public String toString() {
        return String.format(
                "Class: " + Staff.class.getSimpleName() + 
                "\nFirst Name: " + this.getfName() + 
                "\nLast Name: " + this.getlName() +
                "\nTitle : "  +   this.getTitle() +    
                "\n");
    }

    /**
     * @return the assistant
     */
    public String getAssistant() {
        return assistant;
    }

    /**
     * @return the tutor
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * @return the financialAide
     */
    public String getFinancialAide() {
        return financialAide;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
}
