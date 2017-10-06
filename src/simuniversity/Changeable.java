/*
 * Last Updated: 9/8/2017
 * Class description: Interface class.
    
   Class that defines one method to change names in Student and Faculty
 */
package simuniversity;

/**
 *
 * @author Rick
 */
public interface Changeable {
    
    /**
     *
     * @param fName
     * @param lName
     */
    
    /*
    Changeable interface defines the ChangeName method that accepts two args
    using user input to change the names in these class objects
    */
    public void ChangeName(String fName, String lName);
}
