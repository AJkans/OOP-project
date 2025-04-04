import java.util.Scanner;
import java.util.Date;

class StudentRecord {
    String name;
    String id;
    int[] marks;
    double avg;
    String grade;
    String recommendation;
    
    public StudentRecord(String n, String i, int[] m) {
        name = n;
        id = i;
        marks = m;
        calculateResults();
    }
    
    private void calculateResults() {
        int total = 0;
        for(int mark : marks) {
            total += mark;
        }
        avg = total / 5.0;
        
        if(avg >= 75) {
            grade = "A";
            recommendation = "Excellent performance!";
        } else if(avg >= 60) {
            grade = "B"; 
            recommendation = "Good effort!";
        } else if(avg >= 50) {
            grade = "C";
            recommendation = "Could do better";
        } else {
            grade = "F";
            recommendation = "Needs improvement";
        }
    }
    
    void displayCard() {
        System.out.println("\n==== REPORT CARD ====");
        System.out.println("Date: " + new Date());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subjects:");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(" Subject " + (i+1) + " -> " + marks[i]);
        }
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("=====================");
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRecord[] classList = new StudentRecord[10];
        
        System.out.println("EXAM PROCESSING SYSTEM");
        System.out.println("Enter data for 10 students:");
        
        for(int i = 0; i < classList.length; i++) {
            System.out.println("\nStudent " + (i+1) + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("ID: ");
            String id = sc.nextLine();
            
            int[] marks = new int[5];
            System.out.println("Enter marks (5 subjects):");
            for(int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j+1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Clear input
            
            classList[i] = new StudentRecord(name, id, marks);
        }
        
        System.out.println("\n\n*** FINAL REPORTS ***");
        for(StudentRecord s : classList) {
            s.displayCard();
        }
    }
}