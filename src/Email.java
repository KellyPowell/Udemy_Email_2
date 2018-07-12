// Scenario: You are charged with the task of creating email accounts for new hires
// Generate an email with the following syntax:  firstname.lastname@department.company.com
// Generate a random String for a PW
// Have set methods to change the PW, set mailbox capacity, and define alternate email address
// Have get methods to display the name, email, and mailbox capacity

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;  // only used in the constructor, could make local variable
    private String password;
    private int mailboxCapacity = 500;
    private String altEmailAddress;
    private String email;
    private int defaultPWLength = 10;   // look into types  could be considered a constant (final?)


    // Constructor to receive first and last name
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("DEPARTMENT CODES: ");
        System.out.println("Accounting: 1");
        System.out.println("Customer Service: 2");
        System.out.println("Development: 3");
        System.out.println("None: 0");                  //keep UI separate from constructor : )
        System.out.println("Dept Code:  ");
        // Ask for the department
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            this.department = "acct";
        } else if (departmentChoice == 2) {
            this.department = "cs";
        } else if (departmentChoice == 3) {
            this.department = "dev";
        } else {
            this.department = "";
        }

        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".mindbody.com";

        this.password = randomPassword(defaultPWLength);

    }


    // Method to set mail box capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAltEmail(String altEmail) {
        this.altEmailAddress = altEmail;
    }

    // Method to change PW
    public void changePassword(String newPassword) {  // need to make sure pw is 10 characters
        this.password = newPassword;
        System.out.println("Password updated!");
    }

    // Get method to display name, email, mailbox capacity
    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAltEmailAddress() {
        return this.altEmailAddress;
    }

    private String randomPassword(int defaultPWLength) {
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890$%#@!";
        char[] passwordBuilder = new char[defaultPWLength];
        for (int i = 0; i < defaultPWLength; i++) {
            int index = (int) (Math.random() * characterSet.length());
            passwordBuilder[i] = characterSet.charAt(index);
            this.password = new String(passwordBuilder);
        }
        return this.password;
    }
}
