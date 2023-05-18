package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email is " + this.firstName + " " + this.lastName);

        this.department = setDepartment();

        System.out.println("Departemnt " + this.department);

        this.password = randomPassword(defaultPasswordLength);

        System.out.println("Your password is " + this.password);
    }

    //Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none." +
                " Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice==1)
            return "sales";
        else if(depChoice==2)
            return  "dev";
        else if (depChoice==3)
            return "acct";
        else
            return "";
    }


    //Generate a random password
    private String randomPassword(int length){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];

        for(int i=0;i<length;i++)
        {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    //Set the mailbox capacity

    //Set the alternate Email

    //Change the password


}
