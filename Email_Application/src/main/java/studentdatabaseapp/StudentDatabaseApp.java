package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //ask how many students we want to add
        System.out.println("Enter number of courses to enroll");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();

        Student[] students = new Student[numOfStudent];

        for(int n=0;n<numOfStudent;n++)
        {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }

       for (int n=0;n<numOfStudent;n++)
       {
           System.out.println(students[n]);
       }

    }
}
