package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task3.Student;

/**
 * Classes and Objects
 */
public final class Task3 {
    public static void solution() {

        Student[] students = {
                new Student("John", 1025, randomGrades()),
                new Student("Jack", 1025, randomGrades()),
                new Student("Scott", 1025, randomGrades()),
                new Student("Philip", 1025, randomGrades()),
                new Student("William", 1026, randomGrades()),
                new Student("Kate", 1026, randomGrades()),
                new Student("Kelly", 1026, randomGrades()),
                new Student("Petty", 1027, randomGrades()),
                new Student("Jimmy", 1027, new int[] {9,9,9,10,10}),
                new Student("Nancy", 1027, new int[] {10,10,9,9,9})
        };

        for (Student student : students) {
            if (student.isHighAchiever()) {
                System.out.println(student);
            }
        }
    }

    private static int[] randomGrades() {
        int[] grades = new int[GRADES_NUMBER];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) ((HIGHEST_GRADE - LOWEST_GRADE + 1) * Math.random() + LOWEST_GRADE);
        }
        return grades;
    }

    private static final int GRADES_NUMBER = 5;
    private static final int LOWEST_GRADE = 1;
    private static final int HIGHEST_GRADE = 10;
}
