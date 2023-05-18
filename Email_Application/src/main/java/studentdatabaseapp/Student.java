package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses ;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your firstname: " );
        this.firstName = sc.nextLine();

        System.out.print("Enter your lastname: " );
        this.lastName = sc.nextLine();

        System.out.println("1 Freshman\n2 Sophmore\n3 Junior\n4 Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " +studentId);



    }

    //Generate an ID
    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" +id;
    }



    //Enroll in courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q for quit): ");
            Scanner sc= new Scanner(System.in);
            String course = sc.nextLine();

            if(!course.equals("Q"))
            {
                courses = courses + '\n' + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{
                System.out.println("BREAK");
                break;
            }


        }while(1!=0);

        System.out.println("ENROLLED in " + courses);
        System.out.println("TUTION BALANCE " + tuitionBalance);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your Balance is $" +tuitionBalance );
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance-payment;
        System.out.println("Thank you for your payment of $" + payment );
        viewBalance();

    }

    //Show status


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentId='" + studentId + '\'' +
                ", courses='" + courses + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }
}
