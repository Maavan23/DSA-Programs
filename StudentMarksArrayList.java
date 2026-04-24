package batch49;
import java.util.ArrayList;
import java.util.List;

public class StudentMarksArrayList {

    static class Subject {
        String name;
        double marks;

        Subject(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    static class Student {
        String studentId;
        String name;
        List<Subject> subjectMarks; // Ordered list — preserves subject sequence

        Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            this.subjectMarks = new ArrayList<>();
        }

        // Add marks in real-time (sequential order)
        public void addMark(String subjectName, double marks) {
            subjectMarks.add(new Subject(subjectName, marks));
            System.out.println("Added: " + subjectName + " = " + marks);
        }

        // View marks for a particular subject
        public void viewMark(String subjectName) {
            for (Subject s : subjectMarks) {
                if (s.name.equalsIgnoreCase(subjectName)) {
                    System.out.println(studentId + " - " + subjectName + ": " + s.marks);
                    return;
                }
            }
            System.out.println("Subject not found: " + subjectName);
        }

        // Calculate average
        public double calculateAverage() {
            if (subjectMarks.isEmpty()) return 0;
            double total = 0;
            for (Subject s : subjectMarks) total += s.marks;
            return total / subjectMarks.size();
        }

        // Finalize grade
        public String getGrade(double average) {
            if (average >= 75) return "A";
            else if (average >= 65) return "B";
            else if (average >= 55) return "C";
            else if (average >= 45) return "S";
            else return "F";
        }

        // Display full report
        public void displayReport() {
            System.out.println("\n===== Report for " + name + " (" + studentId + ") =====");
            for (int i = 0; i < subjectMarks.size(); i++) {
                Subject s = subjectMarks.get(i);
                System.out.println((i + 1) + ". " + s.name + " : " + s.marks);
            }
            double avg = calculateAverage();
            System.out.println("Average : " + avg);
            System.out.println("Grade   : " + getGrade(avg));
        }
    }

    public static void main(String[] args) {
        Student student = new Student("S001", "Kasun Perera");

        // Real-time sequential mark entry
        student.addMark("Mathematics", 78);
        student.addMark("Physics", 65);
        student.addMark("Chemistry", 55);
        student.addMark("English", 82);

        // View a specific subject
        student.viewMark("Physics");

        // Full report
        student.displayReport();
    }
}