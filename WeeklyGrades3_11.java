import java.util.Scanner;
public class WeeklyGrades3_11 {
    static int[][] grades; 
    static int numStudents, numWeeks; 
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        setupGrades(); 
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Grades");
            System.out.println("2. Display Grades");
            System.out.println("3. Find Week with Highest Grade");
            System.out.println("4. Find Student with Highest Grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input11.nextInt();
            switch (choice) {
                case 1 -> inputGrades();
                case 2 -> displayGrades();
                case 3 -> weekWithHighestGrade();
                case 4 -> studentWithHighestGrade();
                case 5 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void setupGrades() {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = input11.nextInt();
        System.out.print("Enter the number of weeks: ");
        numWeeks = input11.nextInt();
        grades = new int[numStudents][numWeeks]; 
    }
    public static void inputGrades() {
        Scanner input11 = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input11.nextInt();
            }
        }
    }
    public static void displayGrades() {
        System.out.println("\nGrades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void weekWithHighestGrade() {
        int maxGrade = -1, weekIndex = -1;
        for (int week = 0; week < numWeeks; week++) {
            for (int student = 0; student < numStudents; student++) {
                if (grades[student][week] > maxGrade) {
                    maxGrade = grades[student][week];
                    weekIndex = week;
                }
            }
        }
        System.out.println("\nThe highest grade is " + maxGrade + " in Week " + (weekIndex + 1));
    }
    public static void studentWithHighestGrade() {
        int maxGrade = -1, studentIndex = -1;
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numWeeks; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        System.out.println("\nStudent " + (studentIndex + 1) + " has the highest grade: " + maxGrade);
        System.out.print("Grades: ");
        for (int j = 0; j < numWeeks; j++) {
            System.out.print(grades[studentIndex][j] + " ");
        }
        System.out.println();
    }
}