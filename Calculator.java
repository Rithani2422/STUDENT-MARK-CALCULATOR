package StudentMarkCalculator;

import java.util.Scanner;

public class Calculator {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int subjects = sc.nextInt();
        int totalMarks = 0;
        int marks;

        for (int i = 1; i <= subjects; i++) {
            while (true) {
                System.out.println("Enter marks for subject " + i + " out of 100:");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid mark! Please enter a value between 0 and 100.");
                }
            }

            if (marks < 35) {
                System.out.println("Fail in subject " + i);
            }

            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);
        double percentage = (double) totalMarks / (subjects * 100) * 100;
        String grade = calculateGrade(percentage);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 35) {
            return "E";
        } else {
            return "Fail";
        }
    }
}

