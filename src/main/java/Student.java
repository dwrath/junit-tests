import java.util.ArrayList;

public class Student {
    private static long id;
    private static String name;
    static ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static long getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static ArrayList<Integer> addGrade(int grade) {
        grades.add(grade);
        return grades;
    }
    public static ArrayList<Integer> getGrades() {
        return grades;
    }

    public static int getGradeAverage() {
        int sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}
