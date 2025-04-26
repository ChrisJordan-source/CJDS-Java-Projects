import java.util.Scanner;

class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to check if the student passed
    public boolean isPassed() {
        return this.grade >= 75;
    }

    // Getters for name and grade
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Accepting names and grades for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, grade);
        }

        // Displaying if each student passed or not
        for (Student student : students) {
            System.out.println(student.getName() + " has " + (student.isPassed() ? "passed" : "not passed") + " with a grade of " + student.getGrade());
        }

        scanner.close();
    }
}