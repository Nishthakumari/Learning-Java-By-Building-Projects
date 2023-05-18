package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //ask how many students we want to add

        //Create n numbers of new students

        Student st1 = new Student();
        st1.enroll();
        st1.payTuition();
        System.out.println(st1.toString());

    }
}
