import java.util.Scanner;
public class WeeklyGrades_11 {
    static int[][] grades = new int[5][7]; 
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input student grades");
            System.out.println("2. Display all student grades from the first week to the seventh week");
            System.out.println("3. Find the week that has the highest grade from all students");
            System.out.println("4. Find the student with the highest grade (also display the grade information for each week)");
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
    public static void inputGrades() {
        Scanner input11 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student grade " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input11.nextInt();
            }
        }
    }
    public static void displayGrades() {
        System.out.println("\nStudent grades from the first week to the seventh week:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void weekWithHighestGrade() {
        int maxGrade = -1, weekIndex = -1;
        for (int week = 0; week < 7; week++) {
            for (int student = 0; student < 5; student++) {
                if (grades[student][week] > maxGrade) {
                    maxGrade = grades[student][week];
                    weekIndex = week;
                }
            }
        }
        System.out.println("\nWeek that has the highest grade from all students " + (weekIndex + 1));
    }
    public static void studentWithHighestGrade() {
        int maxGrade = -1, studentIndex = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        System.out.println("\nStudent with the highest grade: " + (studentIndex + 1));
        System.out.print("Grades: ");
        for (int j = 0; j < 7; j++) {
            System.out.print(grades[studentIndex][j] + " ");
        }
        System.out.println();
    }
}