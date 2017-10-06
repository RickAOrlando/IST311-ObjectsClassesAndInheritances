/*
 * Last Updated: 9/8/2017
 * Class description: Super/abstract class.
    
   Class declares and encapulates variables.
 */
package simuniversity;

import java.util.Scanner;

/**
 *
 * @author Rick
 */
    
abstract public class Person {
    String fName;
    String lName;
    String pNumber;
    String email;
    Scanner input = new Scanner(System.in);
    
    Person(String fName, String lName, String pNumber, String email) {
        this.fName = fName;
        this.lName = lName;
        this.pNumber = pNumber;
        this.email = email;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the pNumber
     */
    public String getpNumber() {
        return pNumber;
    }

    /**
     * @param pNumber the pNumber to set
     */
    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
 