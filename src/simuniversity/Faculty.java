/*
 * Last Updated: 9/8/2017
 * Class description: Child class of Employee.

   Class handles Faculty data, encapsulates variables, and overrides toString method
 */
package simuniversity;

/**
 *
 * @author Rick
 */
public class Faculty extends Employee implements Changeable {
    
    private final String facAssistantProf = "Assistant Professor";
    private final String facAssociateProf = "Associate Professor";
    private final String facProf = "Professor";
    private String title;
    
    Faculty(String fName, String lName, String title) {
        super(0, null, null);
        this.fName = fName;
        this.lName = lName;
        this.title = title;
    }
    
    //Override toString method for proper output
    @Override
    public String toString() {
        return String.format(
                "Class: " + Faculty.class.getSimpleName() + 
                "\nFirst Name: " + this.getfName() + 
                "\nLast Name: " + this.getlName() +
                "\nTitle : "  +   this.getTitle() +    
                "\n");
    }

    //ChangeName method accepting two args to change name
    @Override
    public void ChangeName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

        System.out.println("\nChanged data stored in Faculty. First and last name changed successfully");
        
        //Changing data to new names entered by user through the interface
        this.setfName(fName);
        this.setlName(lName);
        
        //Printing new names to show change
        System.out.println("New first name: " + this.getfName());
        System.out.println("New last name: " + this.getlName()); 
    }
    
    /**
     * @return the facAssistantProf
     */
    public String getFacAssistantProf() {
        return facAssistantProf;
    }

    /**
     * @return the facAssociateProf
     */
    public String getFacAssociateProf() {
        return facAssociateProf;
    }

    /**
     * @return the facProf
     */
    public String getFacProf() {
        return facProf;
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
