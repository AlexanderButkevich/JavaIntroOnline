package by.epam.training_center.part1.beans.task3;

/**
 * Classes and Objects
 */
public class Student {
    private final String name;
    private final int group;
    private final int[] grades;

    public Student(String name, int group, int[] grades) {
        this.name = name;
        this.group = group;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }

    public boolean isHighAchiever() {
        if (grades == null || grades.length < 1) return false;
        for (int grade : grades) {
            boolean isHigh = false;
            for (int highGrade : HIGH_GRADES) {
                if (grade == highGrade) {
                    isHigh = true;
                    break;
                }
            }
            if (!isHigh) return false;
        }
        return true;
    }

    private static final int[] HIGH_GRADES = {9,10};
}
