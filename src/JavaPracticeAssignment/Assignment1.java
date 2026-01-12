package JavaPracticeAssignment;
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks (0 to 100)");
        byte marks = sc.nextByte();
        System.out.println("Enter the fees paid status(Yes/No)");
        String status = sc.next();
        char grade = ' ';

        System.out.println("---------Student Summary---------");
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: "+ name);
        if(marks >=40){
            System.out.println("Marks: " + marks + " (Student passed)");
        }
        else{
            System.out.println("Marks: " + marks + " (Student failed)");
        }
        System.out.print("Grade: ");
        if (marks >=85){
            grade = 'A';
            System.out.println("A");
        }
        else if (marks >= 70 && marks <=84) {
            grade = 'B';
            System.out.println("B");
        }
        else if (marks >=50 && marks <=69) {
            grade = 'C';
            System.out.println("C");
        }
        else{
            grade = 'D';
            System.out.println("D");
        }
        System.out.println("Fees paid status: " + status);
        System.out.print("Certificate Eligibility: ");
        if(marks >=40 && status.equalsIgnoreCase("yes")){
            System.out.println("Eligible for certificate");
        }
        else{
            System.out.println("Not eligible for certificate");
        }
        System.out.print("Course Allocation: ");
        switch (grade){
            case 'A':
                System.out.println("Data Science");
                break;
            case 'B':
                System.out.println("Java Full Stack");
                break;
            case 'C':
                System.out.println("Web Development");
                break;
            case 'D':
                System.out.println("Basic Programming");
                break;
            default:
                System.out.println("Counseling");
                break;
        }
        sc.close();
    }
}
